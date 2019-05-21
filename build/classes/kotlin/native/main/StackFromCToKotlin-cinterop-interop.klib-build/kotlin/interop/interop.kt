@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package interop

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*

// NOTE THIS FILE IS AUTO-GENERATED

fun push(stack: CValuesRef<stack_type>?, value: Int): Unit {
    memScoped {
        return kniBridge0(stack?.getPointer(memScope).rawValue, value)
    }
}

fun pop(stack: CValuesRef<stack_type>?): Int {
    memScoped {
        return kniBridge1(stack?.getPointer(memScope).rawValue)
    }
}

fun createStack(max_size: Int): CPointer<stack_type>? {
    return interpretCPointer<stack_type>(kniBridge2(max_size))
}

fun deleteStack(stack: CValuesRef<stack_type>?): Unit {
    memScoped {
        return kniBridge3(stack?.getPointer(memScope).rawValue)
    }
}

@CStruct("struct { void* p0; int p1; int p2; }")
class Stack(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var data: CPointer<IntVar>?
        get() = memberAt<CPointerVar<IntVar>>(0).value
        set(value) { memberAt<CPointerVar<IntVar>>(0).value = value }
    
    var size: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var top: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

typealias stack_type = Stack

@SymbolName("interop_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: Int): Unit
@SymbolName("interop_kniBridge1")
private external fun kniBridge1(p0: NativePtr): Int
@SymbolName("interop_kniBridge2")
private external fun kniBridge2(p0: Int): NativePtr
@SymbolName("interop_kniBridge3")
private external fun kniBridge3(p0: NativePtr): Unit
