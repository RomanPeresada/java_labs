package module2.lab14.lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integers ={1,2,3,4,5,6,7,8,9};
        String [] strings = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        MyMixer<Integer> myMixerForInt = new MyMixer<>(integers);
        MyMixer<String> myMixerForString = new MyMixer<>(strings);
        myMixerForInt.shuffle();
        myMixerForString.shuffle();
        System.out.println(Arrays.toString(myMixerForInt.getArray()));
        System.out.println(Arrays.toString(myMixerForString.getArray()));

    }

}
