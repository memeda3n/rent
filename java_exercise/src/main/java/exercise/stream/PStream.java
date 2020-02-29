package exercise.stream;


import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PStream {


    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(123,2321,23,122,2332,2123);
        System.out.println(JSONObject.toJSONString(integers.stream().sorted().collect(Collectors.toList())));
        System.out.println(JSONObject.toJSONString(integers.stream().findAny().get()));
    }




}
