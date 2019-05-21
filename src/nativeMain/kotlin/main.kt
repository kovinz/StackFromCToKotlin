
fun main(){
    println("Hello world!")

    val stack = StackKot(256)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}