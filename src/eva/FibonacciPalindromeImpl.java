package eva;/**
 * @author 你的名字
 * @date 2020/10/25 18:12
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: pengchenglin
 * @create: 2020-10-25 18:12
 */
public class FibonacciPalindromeImpl implements FibonacciPalindrome{
    @Override
    public Pair findFibonacciPalindrome(List<Integer> sequence) {
        List<Integer> s = sequence;
        int size = s.size();
        if(size==1){
            return new PairImpl<>(0,1);
        }
        if(size==2){
            if(s.get(0).equals(s.get(1))){
                return new PairImpl<>(0,2);
            }
        }

        if(size==3){
            if(s.get(0).equals(s.get(2))){
                return new PairImpl<>(0,3);
            }
        }
        int start = 0;
        int len = 0;
        for(int a = 0;a<size;a++){
            int t1 = 0;
            int s1=0;
            if(a+1<size && s.get(a).equals(s.get(a+1))){
                int x =a;
                int y = a+1;
                t1++;
                t1++;
                while (--x>=0 &&
                        ++y<size &&
                        s.get(x).equals(s.get(y)) &&
                        (y-2<a+1 ||  s.get(y).equals(s.get(y-2)+s.get(y-1)))
                        ){
                    s1 = x;
                    t1++;
                    t1++;
                }
            }
            if(t1>len){
                start = s1;
                len = t1;
            }

            int t2 = 1;
            int s2 = 0;
            if(a+1<size && a-1>=0 && s.get(a-1).equals(s.get(a+1))){
                int e = a-1;
                int f = a+1;
                t2++;
                t2++;
                while (--e>=0 &&
                        ++f<size &&
                        s.get(e).equals(s.get(f)) &&
                        (f-2<a+1 ||  s.get(f).equals(s.get(f-2)+s.get(f-1)))
                        ){
                    s2 = e;
                    t2++;
                    t2++;
                }
            }
            if(t2>len){
                start = s2;
                len = t2;
            }

        }
        if(len>4){
            return new PairImpl<>(start,len);
        }

        return null;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        //list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        Pair pair = new FibonacciPalindromeImpl().findFibonacciPalindrome(list);
        System.out.println(pair.toString());
    }
}
