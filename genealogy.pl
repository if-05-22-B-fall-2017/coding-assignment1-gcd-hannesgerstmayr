/*parent, child*/
parent(adam, john).
parent(eve, john).
parent(eve, lisa).
parent(john, anne).
parent(john, pat).
parent(pat, jacob).
parent(carol, jacob).

/*parent von pat*/
parent(X, pat).

/*lisa, any child?*/
parent(lisa, X).

male(adam).
male(john).
male(pat).
male(jacob).

female(eve).
female(anne).
female(lisa).
female(carol).

grandparent(X, Y) :- parent(X, Z), parent(Z, Y). /*grandparent(adam, pet) yes,  grandparent(john, pat) no (->only parent)*/
