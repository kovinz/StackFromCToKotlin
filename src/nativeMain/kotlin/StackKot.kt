import interop.createStack
import interop.stack_type
import kotlinx.cinterop.CPointer

class StackKot constructor(maxSize: Int){
    val stack: CPointer<stack_type>?

    init{
        stack = createStack(maxSize)
    }
    fun push(value: Int){
        interop.push(this.stack, value)
    }

    fun pop(): Int{
        return interop.pop(this.stack);
    }

    fun deleteStack(){
        interop.deleteStack(this.stack);
    }
}