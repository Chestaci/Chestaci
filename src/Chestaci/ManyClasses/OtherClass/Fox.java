package Chestaci.ManyClasses.OtherClass;

import Chestaci.ManyClasses.BasicClass.MrWhite;

public class Fox {
    public void testInternal() {
        MrWhite.Tea tea = new MrWhite.Tea();
       // MrWhite.Tea.BlackTea bt = new MrWhite.Tea.BlackTea();                                   //protected
      //  MrWhite.Tea.WhiteTea wt = new MrWhite.Tea.WhiteTea();                                   //private
        MrWhite.Tea.GreenTea gt = new MrWhite.Tea.GreenTea();
       // MrWhite.Tea.HerbalTea ht = new MrWhite.Tea.HerbalTea();                                 //static not public

       // MrWhite.Auto auto = new MrWhite.Auto();                                                 //private

      //  MrWhite.Album album = new MrWhite.Album();                                              //protected
       // MrWhite.Album.Foto foto = new MrWhite.Album.Foto();                                       //Album - protected
      // MrWhite.Album.NegativesFoto negativesFoto = new MrWhite.Album.NegativesFoto();            //Album - protected
       // MrWhite.Album.CommentsFoto commentsFoto = new MrWhite.Album.CommentsFoto();               //Album - protected
      //  MrWhite.Album.CopyFoto copyFoto = new MrWhite.Album.CopyFoto();                           //Album - protected

      //  MrWhite.Hat hat = new MrWhite.Hat();                                                    //static not public
      //  MrWhite.Hat.WinterHat winterHat = new MrWhite.Hat.WinterHat();                          //Hat - static not public
      //  MrWhite.Hat.AutumnHat autumnHat = new MrWhite.Hat.AutumnHat();                          //Hat - static not public
      //  MrWhite.Hat.SummerHat summerHat = new MrWhite.Hat.SummerHat();                          //Hat - static not public
      //  MrWhite.Hat.SpringHat springHat = new MrWhite.Hat.SpringHat();                          //Hat - static not public

      //  MrWhite.Carrot carrot = new MrWhite.Carrot();                                           //private
      //  MrWhite.Friends friends = new MrWhite.Friends();                                        //protected
      //  MrWhite.Instagram instagram = new MrWhite.Instagram();                                  //non-static
       // MrWhite.Candy candy = new MrWhite.Candy();                                              //static not public
    }
}
