package meruzhan_gasparyan;

/**
 * Created by meruzhan.gasparyan on 14-Apr-17.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {


        SingletonBeanFactory sing = SingletonBeanFactory.getInstance();


        BeanImplInterface b1 = sing.getBeanInstance(BeanImplInterface.class);
        BeanImplInterface b2 = sing.getBeanInstance(BeanImplInterface.class);
        System.out.println(b1 == b2);
        BeanImplAbstract beanImplAbstract = sing.getBeanInstance(BeanImplAbstract.class);
//      System.out.println(beanImplAbstract == b1);

        BeanInterface b3 = sing.getBeanInstance(BeanInterface.class);
        System.out.println(b3);

        BeanAbstract b4 = sing.getBeanInstance(BeanAbstract.class);
        BeanAbstract b5 = sing.getBeanInstance(BeanAbstract.class);
        System.out.println(b4);
        System.out.println(b4 == b5);

//      SingletonBeanFactory singleton =  sing.getBeanInstance(SingletonBeanFactory.class);
    }
}
