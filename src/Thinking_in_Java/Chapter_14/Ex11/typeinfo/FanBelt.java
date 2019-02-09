package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

import Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory;

class FanBelt extends Belt {


    public static class Factory
            implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<FanBelt>{
        public FanBelt create() {
            return new FanBelt();
        }
    }
}
