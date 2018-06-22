import java.io.File;
import com.aliyun.oss.OSSClient;
/**
 * 文件上传至阿里云
 * API https://help.aliyun.com/document_detail/31884.html?spm=5176.doc31883.2.3.K0te63
 * @author Administrator
 */
public class FileUpLoad {


    public static void upLoad(){
// endpoint，region请按实际情况填写
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
// accessKey登录https://ak-console.aliyun.com/查看
        String accessKeyId = "\"XXXXXXXXX\" ";
        String accessKeySecret = "\"XXXXXXXXX\" ";
// 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
// 上传文件
        //(存储空间名，上传文件命名，上传文件路径)
        ossClient.putObject("tjr", "key", new File("D:\\Program\\IDEA\\IDEA\\workspace\\Tellphone\\说明.txt"));
//关闭client
        ossClient.shutdown();
    }

    public static void main(String[] args) {
        FileUpLoad.upLoad();
    }
}