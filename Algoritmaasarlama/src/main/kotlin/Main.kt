/* ilk uygulamam, basitçe kullanıcıdan bir sayı girdiren ve bu sayının
faktöriyelini hesaplayan kod bloğu */


fun main()
{
 var number:Int
    var facResult=1
 println("Faktöriyelini almak istediğiniz sayı değerini giriniz:")
    number= readLine()!!.toInt()


    for (i in 1..number)
    {
        facResult *= i
    }


    println("$number sayısının faktöriyel değeri $facResult")

}