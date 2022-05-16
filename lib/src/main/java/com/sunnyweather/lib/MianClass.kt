package com.sunnyweather.lib




fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b


