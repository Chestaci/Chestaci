package Thinking_in_Java.Chapter_14.Ex11.typeinfo;

class OilFilter extends Filter {
    public static class Factory
            implements Thinking_in_Java.Chapter_14.Ex11.typeinfo.factory.Factory<OilFilter>{
        public OilFilter create() {
            return new OilFilter();
        }
    }
}
