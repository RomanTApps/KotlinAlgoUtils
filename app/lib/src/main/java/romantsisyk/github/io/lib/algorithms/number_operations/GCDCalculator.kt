package romantsisyk.github.io.lib.algorithms.number_operations

class GCDCalculator {
    fun computeGCD(a: Int, b: Int): Int {
        var x = a
        var y = b
        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }
}
