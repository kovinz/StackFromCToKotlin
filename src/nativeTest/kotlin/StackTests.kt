import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertEquals

class StackTests {

    @Test
    fun testOnePushAndPop() {
        val stack = StackKot(256)
        stack.push(1)
        assertTrue { stack.pop() == 1 }
    }
}