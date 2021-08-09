

object ceaserChiper extends App {
  
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  // Encryption 
  val encode=(c:Char,key:Int,s:String)=>s((s.indexOf(c.toUpper)+key)%s.size)

   // Decryption  
  
  val decode=(c:Char,key:Int,s:String)=>
    if((s.indexOf(c.toUpper)-key)<0){
      s(s.size+(s.indexOf(c.toUpper)-key))
    }
    else
    {
      s((s.indexOf(c.toUpper)-key)%s.size)
    }
  val chiper=(method:(Char,Int,String)=>Char,txt:String,key:Int,s:String)=>txt.map(method(_,key,s))

  val getmsg=scala.io.StdIn.readLine("Type your text :")
  //take the #shift
  
  println("No of Shift: ")
  val shift=scala.io.StdIn.readInt()
  
  val enText=chiper(encode,getmsg,shift,alphabet)
  
  println("Encoded text:"+enText)
  
  println("Decoded text:"+chiper(decode,enText,shift,alphabet))
  
 
}