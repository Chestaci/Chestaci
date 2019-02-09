package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

class AirFilter extends Filter{
    public static class Factory
            implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<AirFilter>{
        public AirFilter create() {
            return new AirFilter();
        }
    }
}
