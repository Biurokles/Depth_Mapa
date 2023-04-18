package com.example.depthmapa

import Pixel

class Pic3D(pixel: Pixel, value: Any, var length: Int) : Picture(pixel, value) {

    override fun getValue(): Any {
        return length
    }
}