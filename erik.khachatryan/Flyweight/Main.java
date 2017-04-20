import com.synisys.erik.factories.TreeModelFlyweight;
import com.synisys.erik.models.Bark;
import com.synisys.erik.models.Leaf;
import com.synisys.erik.models.Tree;

public class Main {

    public static void main(String[] args) {
        Tree[] wood = new Tree[10000];
        for (int i = 0; i < wood.length; i++) {
            switch (i % 3) {
                case 0: {
                    wood[i] = new Tree("eghevni", 100, 12, 5, new Leaf(2,3,"push"), new Bark("anhart"));
                    break;
                }
                case 1: {
                    wood[i] = new Tree("xndzoreni", 100, 12, 5, new Leaf(4,5,"xndzorenu terev"), new Bark("hart"));
                    break;
                }
                case 2: {
                    wood[i] = new Tree("tandzeni", 100, 12, 5, new Leaf(2,3,"tandzenu terev"), new Bark("hart"));
                    break;
                }
            }
        }
        System.out.println("Bark pool size = " + TreeModelFlyweight.getBarkPool().size());
        System.out.println("Leaf pool size = " + TreeModelFlyweight.getLeafPool().size());
    }
}
