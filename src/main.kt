fun main() {
        namesOfGirls(arrayOf("Judy", "Carol", "Grace","Mercy"))
        cities (arrayOf("harara", "mumbai", "dodoma", "jakarta"))
        letters(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
        ladies(arrayOf("Rehema", "Mary", "Martha"))
}
fun namesOfGirls(names: Array<String>){
        println(names.contentToString())
}
fun cities(names: Array<String>) {
        names.forEach { names ->
                println(names.capitalize())
        }
}
fun letters(number: Array<Int>) {
        var answer = number[2] + number[5]
        println(answer)
        var comb =number.indexOf(158)
        println(comb)
        var rope= number.sortedArray()
        println(rope.contentToString())
}

fun ladies(names: Array<String>):Array<String> {
        var name=names
        println(names.contentToString())
        return name

        }


























