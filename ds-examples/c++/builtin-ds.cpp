// Include the vector library
#include <vector>

// Include the list library
#include <list>

// Include the set library
#include <set>
#include <unordered_set>

// Include the map library
#include <map>
#include <unordered_map>

// Include the stack library
#include <stack>

// Include the queue library
#include <queue>

// Include the String library
#include <string>

// Include the iostream library
#include <iostream>

using namespace std;

int main()
{
    // Vectors --------------------------------------------------
    // Create a vector called cars that will store strings
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};

    // Print vector elements
    for (string car : cars)
    {
        cout << car << "\n";
    }

    // Methods
    // cars.push_back("Sape") add element to the end
    // cars.pop_back("Sape2") remove element from the end
    // cars.size() size of vector
    // cars.empty() whether its empty or not

    // Stacks and Queues --------------------------------------------------
    std::stack<int> tower;

    tower.push(3); // Add element at the top of a stack
    tower.push(2);
    tower.push(1);

    while (!tower.empty())
    {
        std::cout << tower.top() << " ";
        tower.pop(); // Remove element at the top of the stack
    }
    // Outputs: 1 2 3

    std::queue<int> order;

    order.push(10); // Add element at the end of queue
    order.push(9);
    order.push(8);

    while (!order.empty())
    {
        std::cout << order.front() << " ";
        order.pop(); // Remove element at the front of queue
    }
    // Outputs: 10 9 8

    // Sets --------------------------------------------------
    std::unordered_set<int> primes({2, 3, 5, 7});

    primes.insert(11);
    primes.insert(13);
    primes.insert(11); // Duplicates are not inserted

    primes.erase(2);
    primes.erase(13);

    // Outputs: primes does not contain 2.
    if (primes.count(2))
        std::cout << "primes contains 2.\n";
    else
        std::cout << "primes does not contain 2.\n";

    // Outputs: Size of primes: 4
    std::cout << "Size of primes: " << primes.size() << "\n";

    // Arrays --------------------------------------------------
    char vowels[5] = {'a', 'e', 'i', 'o', 'u'};

    std::cout << vowels[2]; // Outputs: i

    char game[3][3] = {
        {'x', 'o', 'o'},
        {'o', 'x', 'x'},
        {'o', 'o', 'x'}};

    std::cout << game[0][2]; // Outputs: o

    // Hash Maps --------------------------------------------------
    std::unordered_map<std::string, int> country_codes;

    country_codes.insert({"Thailand", 65});
    country_codes.insert({"Peru", 51});
    country_codes["Japan"] = 81;    // Add a new element
    country_codes["Thailand"] = 66; // Access an element

    country_codes.erase("Peru");

    // Outputs: There isn't a code for Belgium
    if (country_codes.count("Belgium"))
    {
        std::cout << "There is a code for Belgium\n";
    }
    else
    {
        std::cout << "There isn't a code for Belgium\n";
    }

    // Outputs: 81
    std::cout << country_codes["Japan"] << "\n";

    // Outputs: 2
    std::cout << country_codes.size() << "\n";

    // Outputs: Japan 81
    //          Thailand 66
    for (auto it : country_codes)
    {
        std::cout << it.first << " " << it.second << "\n";
    }
    return 0;
}