def print_friends():
    users = [
        {"id": 0, "name": "Hero"},
        {"id": 1, "name": "Dunn"},
        {"id": 2, "name": "Sue"},
        {"id": 3, "name": "Chi"},
        {"id": 4, "name": "Thor"},
        {"id": 5, "name": "Clive"},
        {"id": 6, "name": "Hicks"},
        {"id": 7, "name": "Devin"},
        {"id": 8, "name": "Kate"},
        {"id": 9, "name": "Klein"}
    ]

    friendship_pairs = [(0, 1), (0, 2), (1, 2), (1, 3), (2, 3), (3, 4), (4, 5), (5, 6), (5, 7), (6, 8), (7, 8), (8, 9)]

    # Initialize the dict with an empty list for each user id:
    friendships = {user["id"]: [] for user in users}

    # And loop over the friendship pairs to populate it:
    for i, j in friendship_pairs:
        friendships[i].append(j)  # Add j as a friend of user i
        friendships[j].append(i)  # Add i as a friend of user j

    print(type(friendships), friendships)
    print(type(friendships[0]), friendships[0])
    print(type(friendships[0][0]), friendships[0][0])


if __name__ == "__main__":
    print_friends()
