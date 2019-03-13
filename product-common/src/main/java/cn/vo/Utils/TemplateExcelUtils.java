package cn.vo.Utils;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

public class TemplateExcelUtils {

    /**
     * 根据excel模板生成新的excel
     *
     * @param beans
     * @param file
     * @param path
     * @return
     */
    public static File createNewFile(Map<String, Object> beans, File file, String path) {
        XLSTransformer transformer = new XLSTransformer();

        //可以写工具类来生成命名规则
        String name = "question.xlsx";
        File newFile = new File(path + name);


        try (InputStream in = new BufferedInputStream(new FileInputStream(file));
             OutputStream out = new FileOutputStream(newFile)) {
            Workbook workbook = transformer.transformXLS(in, beans);
            workbook.write(out);
            out.flush();
            return newFile;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return newFile;
    }

    /**
     * 将服务器新生成的excel从浏览器下载
     *
     * @param response
     * @param excelFile
     */
    public static void downloadFile(HttpServletResponse response, File excelFile) {
        /* 设置文件ContentType类型，这样设置，会自动判断下载文件类型 */
        response.setContentType("multipart/form-data");
        /* 设置文件头：最后一个参数是设置下载文件名 */
        response.setHeader("Content-Disposition", "attachment;filename=" + excelFile.getName());
        try (
                InputStream ins = new FileInputStream(excelFile);
                OutputStream os = response.getOutputStream()
        ) {
            byte[] b = new byte[1024];
            int len;
            while ((len = ins.read(b)) > 0) {
                os.write(b, 0, len);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    /**
     * 浏览器下载完成之后删除服务器生成的文件
     * 也可以设置定时任务去删除服务器文件
     *
     * @param excelFile
     */
    public static void deleteFile(File excelFile) {

        excelFile.delete();
    }

    //如果目录不存在创建目录 存在则不创建
    public static void createDir(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
