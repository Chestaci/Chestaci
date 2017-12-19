package Chestaci.ManyClasses.BasicClass;

import java.awt.*;

public class MrWhite {
    public static class Tea{
        protected static class BlackTea{
        }
        private static class WhiteTea{
        }
        public static class GreenTea{
        }
        static class HerbalTea{
        }
    }
    private static class Auto {
    }

    protected static class Album {
        protected static class Foto{
        }
        private static class NegativesFoto{
        }
        public static class CommentsFoto{
        }
        static class CopyFoto{
        }
    }

    static class Hat {
        protected static class WinterHat{
        }
        private static class AutumnHat{
        }
        public static class SummerHat{
        }
        static class SpringHat{
        }
    }

    private class Carrot {
    }
    protected class Friends {
    }
    public class Instagram {
    }
    class Candy {
    }

    public void testInternal() {
        Tea tea = new Tea();
        Tea.BlackTea bt = new Tea.BlackTea();
        Tea.WhiteTea wt = new Tea.WhiteTea();
        Tea.GreenTea gt = new Tea.GreenTea();
        Tea.HerbalTea ht = new Tea.HerbalTea();

        Auto auto = new Auto();

        Album album = new Album();
        Album.Foto foto = new Album.Foto();
        Album.NegativesFoto negativesFoto = new Album.NegativesFoto();
        Album.CommentsFoto commentsFoto = new Album.CommentsFoto();
        Album.CopyFoto copyFoto = new Album.CopyFoto();

        Hat hat = new Hat();
        Hat.WinterHat winterHat = new Hat.WinterHat();
        Hat.AutumnHat autumnHat = new Hat.AutumnHat();
        Hat.SummerHat summerHat = new Hat.SummerHat();
        Hat.SpringHat springHat = new Hat.SpringHat();

        Carrot carrot = new Carrot();
        Friends friends = new Friends();
        Instagram instagram = new Instagram();
        Candy candy = new Candy();
    }
}
