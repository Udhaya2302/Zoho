def generate_power_set(s):
    def backtrack(start, path):
        result.append(path[:])  # Add a copy of the current subset to the result

        for i in range(start, len(s)):
            path.append(s[i])
            backtrack(i + 1, path)
            path.pop()

    result = []
    backtrack(0, [])
    return result

# Example usage:
set_s = ['x', 'y', 'z']
power_set_s = generate_power_set(set_s)
print(power_set_s)
