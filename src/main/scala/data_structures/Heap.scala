package data_structures

import scala.collection.mutable

import models.Dummy

/**
 *
 * Heap can be represented as a tree, but stored in Array for performance.
*This is possible as long as the heap properties are respected:
 *
 *A heap is a specialized tree-based data structure which is essentially an almost complete
    *tree that satisfies the heap property: in a max heap, for any given node C, if P is a
    *parent node of C, then the key (the value) of P is greater than or equal to the key of C.
    *In a min heap, the key of P is less than or equal to the key of C.[2] The node at the "top"
    *of the heap (with no parents) is called the root node.
 *
 *In array representation:
    *Given element in `i`
    *Left child, if present, is in `2i+1`
    *Right child, if present, is in `2i+2`
    *Parent is in `(i-1)/2``
 *
 *
 *## VARIANTS
    * 2–3 heap
    * B-heap
    * Beap
    * Binary heap
    * Binomial heap
    * Brodal queue
    * d-ary heap
    * Fibonacci heap
    * K-D Heap
    * Leaf heap
    * Leftist heap
    * Pairing heap
    * Radix heap
    * Randomized meldable heap
    * Skew heap
    * Soft heap
    * Ternary heap
    * Treap
    * Weak heap
 *
 *# Big O by Varian/Operation
 *
 *Operation		| find-max  |	delete-max	|	insert	| increase-key	|   meld
    *----------------|-----------|---------------|-----------|---------------|-----------
    *Binary			|	Θ(1)	|	Θ(lΘg n)	|  Θ(lΘg n)	|  	Θ(lΘg n)	|	Θ(n)
    *Leftist			|	Θ(1)	|	Θ(lΘg n)	|  Θ(lΘg n)	|  	Θ(lΘg n)	|  Θ(lΘg n)
    *Binomial		|	Θ(1)	|	Θ(lΘg n)	|  Θ(1)[b]	|  	Θ(lΘg n)	|  Θ(lΘg n)
    *Fibonacci		|	Θ(1)	|	Θ(lΘg n)	|	Θ(1)	|	Θ(1)		|	Θ(1)
    *Pairing			|	Θ(1)	|	Θ(lΘg n)	|	Θ(1)	|  	Θ(lΘg n)	|	Θ(1)
    *Brodal			|	Θ(1)	|	Θ(lΘg n)	|	Θ(1)	|	Θ(1)		|	Θ(1)
    *Rank-pairing	|	Θ(1)	|	Θ(lΘg n)	|	Θ(1)	|	Θ(1)		|	Θ(1)
    *Strict Fibonacci|	Θ(1)	|	Θ(lΘg n)	|	Θ(1)	|	Θ(1)		|	Θ(1)
    *2–3 heap		|	Θ(lΘg n)|	Θ(lΘg n)	| Θ(lΘg n)	|	Θ(1)		|	 ?
 *
 *# Resources
 * Heaps: https://en.wikipedia.org/wiki/Heap_(data_structure)
 * Heapsort: https://en.wikipedia.org/wiki/Heapsort
 */
object Heap {

    def heapifyMax(list: List[Int]): mutable.PriorityQueue[Int] = {
        mutable.PriorityQueue(list:_*)
    }

    def heapifyMin(list: List[Int]): mutable.PriorityQueue[Int] = {
//        mutable.PriorityQueue(list:_*)(Ordering.by(-1*_))
        mutable.PriorityQueue(list:_*)(Ordering.by(i => -1 * i))
//      mutable.PriorityQueue(list:_*)(Ordering[Int].reverse)
    }

  def heapifyDummy(list: List[Dummy]) = {
    mutable.PriorityQueue(list:_*)(Ordering.by[Dummy, Int](_.n))
  }

}

