package graph;

import java.io.IOException;

public class test {
    public static void main(String[] args) {
        GraphViz gViz=new GraphViz("C:\\Users\\11969\\Desktop\\1111","D:\\dot\\bin\\dot.exe" );
        gViz.start_graph();
        gViz.addln("A->B");
        gViz.addln("A->C;");
        gViz.addln("C->B;");
        gViz.addln("B->D;");
        gViz.addln("C->E;");
        gViz.end_graph();
        try {
            gViz.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}