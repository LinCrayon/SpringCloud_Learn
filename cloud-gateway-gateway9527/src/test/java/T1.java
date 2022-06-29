import java.time.ZonedDateTime;

/**
 * @Author linshengqian
 * @Date 2022/6/29 15:28
 * @description:
 */
public class T1 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}
// 2022-06-29T15:28:44.483+08:00[Asia/Shanghai]
