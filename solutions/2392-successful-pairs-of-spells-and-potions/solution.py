class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        lst=[]
        potions.sort()
        n=len(potions)
        for i in spells:
            # a=list(filter(lambda x:(i*x)>=success,potions))
            # lst.append(len(a))
            # count=0
            # for j in range(len(potions)):
            #     if (i*potions[j])>=success:
            #         count+=1

            # count = 0
            # for j in potions:
            #     if i * j >= success:
            #         count += 1
            # lst.append(count)
            left = 0
            right = n - 1
            idx = n

            while left <= right:
                mid = (left + right) // 2
                if i * potions[mid] >= success:   # still using your multiplication logic
                    idx = mid
                    right = mid - 1
                else:
                    left = mid + 1

            lst.append(n - idx)

        return lst
