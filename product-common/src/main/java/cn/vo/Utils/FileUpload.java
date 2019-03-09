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
        String path = "";
        if (fileurl.isEmpty()){
            return  path;
        }
        try {
            OutputStream out = null;
            File newFile = new File("G:\\cs\\");
            if (!newFile.exists()) {
                newFile.mkdirs();
            }
            path = "G:\\cs\\"  + fileurl.getOriginalFilename();
            File file2 = new File(path);
            fileurl.transferTo(file2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileurl.getOriginalFilename();
    }


}
