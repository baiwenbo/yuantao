package cn.vo.controller.hans;

import cn.vo.Utils.TemplateExcelUtils;
import cn.vo.pojo.entity.TestPaper;
import cn.vo.service.ITestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("excel")
public class ExcelController {

    @Autowired
    private ITestPaperService testPaperService;

    @GetMapping("/export")
    public void excel(HttpServletResponse response,Integer type) {

        Map map=new HashMap();
        map.put("type",type);
        /**
         * excel导出
         * 1.获取数据集List 插入到map集合中
         * 2.根据模板生成新的excel
         * 3.将新生成的excel文件从浏览器输出
         * 4.删除新生成的模板文件
         */
        List<TestPaper> list=testPaperService.queryAll(map);
        List<TestPaper> paperList=   ExcelSorceUtils.getSorce(list);
        Map<String, Object> beans = new HashMap();
        beans.put("list", paperList);

        //加载excel模板文件
        File file = null;
        try {
            if (type==1){
                file = ResourceUtils.getFile("classpath:excel/question.xlsx");

            }else if (type==2){
                file = ResourceUtils.getFile("classpath:excel/rout.xlsx");

            }else if (type==3){
                file = ResourceUtils.getFile("classpath:excel/sift.xlsx");
            }else if (type==4){
                file = ResourceUtils.getFile("classpath:excel/red.xlsx");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        //配置下载路径
        String path = "/download/";
         TemplateExcelUtils.createDir(new File(path));

        //根据模板生成新的excel
        File excelFile = TemplateExcelUtils.createNewFile(beans, file, path);

        //浏览器端下载文件
        TemplateExcelUtils.downloadFile(response, excelFile);

        //删除服务器生成文件
        TemplateExcelUtils.deleteFile(excelFile);

    }
}
