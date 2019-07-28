
//Functional String Reverse

def stringReverseRecursive(cur: String) : String = {
	if (cur.length>1){
		return stringReverse(cur.tail) + (cur.head) 
	}
	else {
		return cur;
	}
}

def stringReverseFold(cur: String) : String = {
	cur.foldRight(""){
		(acc, cur) => cur + acc
	}
}


