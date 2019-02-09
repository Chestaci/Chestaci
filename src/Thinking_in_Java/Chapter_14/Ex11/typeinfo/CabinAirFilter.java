package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

class CabinAirFilter extends Filter{
    public static class Factory
            implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<CabinAirFilter>{
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
