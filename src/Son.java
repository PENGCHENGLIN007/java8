/**
 * @author 你的名字
 * @date 2020/10/20 0:14
 */

/**
 * @description:
 * @author: pengchenglin
 * @create: 2020-10-20 00:14
 */
public class Son extends father{
    @Override
    void f() {
        System.out.println("son");

    }

    public static void main(String[] args) {
        Son son = new Son();
        son.f();
        this.f();
        f();

    }
}
class father{
    void f(){
        System.out.println("father");
    }
}
