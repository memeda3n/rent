package exercise;

import java.util.List;

public class Layer1 {

    public Layer2 layer2;

}


class Layer2 {

    public List<Layer3> layer3;
}


class Layer3 {
    public Integer val;
}


class ObjectAccessException extends Exception {

}


class Test {


    public Object getPath(Object o, String path) {





        return null;
    }


}