package eva;/**
 * @author 你的名字
 * @date 2020/10/25 18:19
 */

/**
 * @description:
 * @author: pengchenglin
 * @create: 2020-10-25 18:19
 */
public class PairImpl<S, T> implements Pair<S,T> {

    private S s;
    private T t;

    public PairImpl(){}

    public PairImpl(S s,T t){
        this.s = s;
        this.t = t;
    }
    @Override
    public S getFirst() {
        return s;
    }

    @Override
    public T getSecond() {
        return t;
    }

    @Override
    public String toString() {
        return "PairImpl{" +
                "s=" + s +
                ", t=" + t +
                '}';
    }
}
