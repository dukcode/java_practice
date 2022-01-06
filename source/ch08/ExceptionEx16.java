// 08-16 ExceptionEx16.java
import java.io.File;

class ExceptionEx16
{
    public static void main(String[] args)
    {
        try
        {
            File f = creatFile(args[0]);
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "다시 입력하주시기 바랍니다.");
        }
    }
    
    static File creatFile(String fileName) throws Exception
    {
        if (fileName == null || fileName.equals(""))
        {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        fileName = new String("제목없음.txt");
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
