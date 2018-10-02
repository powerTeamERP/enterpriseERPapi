import java.security.MessageDigest;

/**
 * Created by mk on 2018/7/9.
 */
public class test {
    /*public static void main(String[] args) {
        for (int i= 0; i<10;i++ ){
            StringBuffer stringBuffer = new StringBuffer();
            //循环将A表中的id为i变量的a字段更新为i变量的值
            stringBuffer.append("update A set a = '"+i+"' where id = ");
            stringBuffer.append("'"+i+"'");
            //执行sql语句
            System.out.println("我执行的"+i+"个语句"+stringBuffer.toString());
        }
    }*/

/*    public static void main(String[] args) {

        double aa = 3.3;
        int bb = (int)aa;
        System.out.println("double转int："+bb);
        String aa1 = "3.3";
        int bb1 = Integer.valueOf(aa1);
        System.out.println("String转int："+bb1);

    }*/


/*
    public static void main(String[] args) {

        try{
            String time = "12-七月-2018";
//            SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            //这个就是把时间戳经过处理得到期望格式的时间
//            String formatTime = format0.format(time);
//            System.out.println("格式化结果：" + formatTime);

            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf2.parse(time);
            System.out.println("格式化结果：" + date);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

*/

    public static String convertMD5(String inStr){

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++){
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;

    }

    public static String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }

    public static void main(String[] args) {
        String s = new String("tangfuqiang");
        System.out.println("原始：" + s);
        System.out.println("MD5后：" + string2MD5(s));
        System.out.println("加密的：" + convertMD5(s));
        System.out.println("解密的：" + convertMD5(convertMD5(s)));

//        try{
//            Long startLong = 0L;
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date satrtDay = dateFormat.parse("2018-08-26");
//            startLong = satrtDay.getTime();
//            System.out.println(startLong);
//        }catch (Exception e){
//            e.printStackTrace();
//        }




        //1.定义主表接收的实体，并取主表对应的数据
//        Map<String,Object> zhubiao= new HashMap<String, Object>();
//        System.out.println(PluTypeEnum.getName("1"));
//        String url = "http://test-h5.yunshicloud.com/pages/details/details.html?docid=5b5ee00ff2ef030017a1e605&isNew=yes&companyId=7A8D8474359E428C&productId=5B0CAFD2C61145D1BA75DE39BBD66B86";
//        String[] urls = url.split("\\?");
//        if(url.contains("pages/details/details") && urls.length>=2){
//            System.out.println("是对的额~"+"大小："+urls.length+urls[0]+"======="+urls[1]);
//            String data = urls[1];
//            String[] datas = data.split("&");
//            for (String str : datas){
//                if(str.contains("docid")){
//                    System.out.println(str.substring(str.indexOf("=")+1,str.length()));
//                }
//                if(str.contains("companyId")){
//                    System.out.println(str.substring(str.indexOf("=")+1,str.length()));
//                }
//            }
//        }

    }

}
