        for(auto num : nums)
        {
            if(!st.empty() && st.top() >= num)
                st.top() += num;
            else
                st.push(num);
        }
