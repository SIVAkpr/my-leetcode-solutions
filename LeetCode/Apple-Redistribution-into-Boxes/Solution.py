class Solution:
    def minimumBoxes(self, apple: List[int], capacity: List[int]) -> int:
        heapq._heapify_max(capacity)
        pending = sum(apple)
        total_boxes = len(capacity)
        while pending > 0:
            pending -= heapq._heappop_max(capacity)
        return total_boxes - len(capacity)