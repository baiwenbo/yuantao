package cn.vo.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileUpload {

    //上传文件 到指定目录
    public static String uploadFile(MultipartFile fileurl, String fileName) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(fileName);
        String resultUrl="";
        String path = "";
        if (fileurl.isEmpty()){
            return  path;
        }
        try {
            Date date=new Date();
            OutputStream out = null;
            File newFile = new File("E:\\images\\"+sdf.format(date)+"\\");
            if (!newFile.exists()) {
                newFile.mkdirs();
            }
            String pathUrl=sdf.format(date)+"\\"+date.getTime()+fileurl.getOriginalFilename();
             resultUrl=sdf.format(date)+"/"+date.getTime()+fileurl.getOriginalFilename();
            path = "E:\\images\\"+pathUrl;
            File file2 = new File(path);
            fileurl.transferTo(file2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultUrl;
    }


}
