package com.exer.class_demo;

public class SingleClass {

}
class SingleLazy{
    private static SingleLazy singleLazy = null;

    private SingleLazy(){};

    public static SingleLazy getSingleLazy(){
      if(singleLazy == null){
          synchronized (SingleLazy.class){
              if (singleLazy == null){
                  singleLazy = new SingleLazy();
              }
          }
      }
      return singleLazy;
    };
}
class SingleHuge{
    private static SingleHuge singleHuge = new SingleHuge();

    private SingleHuge(){};

    public static SingleHuge getSingleHuge(){
        return singleHuge;
    }
}

