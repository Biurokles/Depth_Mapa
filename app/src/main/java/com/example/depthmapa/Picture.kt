package com.example.depthmapa

import Pixel

abstract class Picture(val pixel: Pixel, var value: Any) {

    abstract fun getValue(): Any

}
