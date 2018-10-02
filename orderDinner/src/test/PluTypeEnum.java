/**
 * Created by mk on 2018/7/17.
 */
public enum PluTypeEnum {

    MON(1,"1"),TUS(2,"2"),WED(3,"3");

    private int value;
    private String name;

    private PluTypeEnum(int value,String name){
        this.value = value;
        this.name = name;
    }

    // 普通方法
    public static int getName(String index) {
        for (PluTypeEnum c : PluTypeEnum.values()) {
            if (c.name == index) {
                return c.value;
            }
        }
        return -1;
    }

}
