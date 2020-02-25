package com.oa;

public class DelayedProjects {
    //https://leetcode.com/discuss/interview-question/397524/

    //No solutions find yet


    /*
    class Solution {
public:
    vector<char> delayedProjects(int dependNum, int delayNum, list<pair<char, char> > dependencies, list<char> delaies) {
        set<char> delaySet(begin(delaies), end(delaies));
        vector<char> delayVec;
        queue<char> q;
        for (char delay : delaies) q.push(delay);

        unordered_map<char, vector<char> > dependMap;
        for (pair<char, char> dependence : dependencies)
            dependMap[dependence.second].emplace_back(dependence.first);

        while (!q.empty()) {
            char project1 = q.front();
            q.pop();
            for (char project : dependMap[project1]) {
                if (!delaySet.count(project)) {
                    delaySet.insert(project);
                    q.push(project);
                }
            }
        }
        delayVec.assign(begin(delaySet), end(delaySet));
        return delayVec;
    }
};

int main() {
    Solution*s = new Solution();
    list<pair<char, char> > dependencies = {{'B','A'}, {'C','B'}, {'C','E'},{'D','C'},{'D','F'},{'E','A'},{'F','E'},{'G','F'}};
    list<char> delaies = {'B','F'};
    vector<char> result = s->delayedProjects(8, 2, dependencies, delaies);
    for (char pro : result) cout << pro << " ";
}

     */
}
