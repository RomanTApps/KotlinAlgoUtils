package tsisyk.app.algorithms.utils

class SetOperations {
    fun union(a: Set<Int>, b: Set<Int>): Set<Int> = a.union(b)

    fun intersection(a: Set<Int>, b: Set<Int>): Set<Int> = a.intersect(b)

    fun difference(a: Set<Int>, b: Set<Int>): Set<Int> = a.subtract(b)
}