from sympy import *
import time

start = time.perf_counter()


def eratosthenes(n):
    is_prime = [True] * (n + 1)
    for i in range(2, int(n ** 0.5) + 1):
        if isprime(i):
            for j in range(i * i, n + 1, i):
                is_prime[j] = False
    return [x for x in range(2, n + 1) if is_prime[x]]


print(eratosthenes(1000))
end = time.perf_counter()
print(end - start)
