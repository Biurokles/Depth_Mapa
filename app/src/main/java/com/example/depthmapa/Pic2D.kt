package com.example.depthmapa

import Pixel

class Pic2D(pixel:Pixel, value: Any, var color: Int) : Picture(pixel, value) {
    override fun getValue(): Any {
        return color
    }

}