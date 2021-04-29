package nicestring



fun String.isNice(): Boolean {
    val pre= listOf(::notContainsSubstring,::containsThreeVowel,::containsDouble)
    return pre.count{ kotlin.run(it)}>=2
}
private fun String.notContainsSubstring(): Boolean{
    val check=this.contains("bu",true)|| this.contains("ba",true)|| this.contains("be",true)
    return !check
}
private fun String.containsThreeVowel(): Boolean{
    return this.count{it=='a'|| it=='e' || it=='i'|| it =='o'|| it=='u'}>=3
}
private fun String.containsDouble(): Boolean
{
    for(i in 0 until this.length-1)
    {
        if(this[i]==this[i+1])
            return true
    }
    return false
}