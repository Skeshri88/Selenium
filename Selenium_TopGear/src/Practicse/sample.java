package Practicse;

import java.io.*;
import java.util.*;
public class sample 
{
	 private static void getSubsets(List<Integer> superSet, int k, int idx, Set<Integer> current,List<Set<Integer>> solution) {
	        //successful stop clause
	        if (current.size() == k) {
	            solution.add(new HashSet<>(current));
	            return;
	        }
	        //unseccessful stop clause
	        if (idx == superSet.size()) return;
	        Integer x = superSet.get(idx);
	        current.add(x);
	        //"guess" x is in the subset
	        getSubsets(superSet, k, idx+1, current, solution);
	        current.remove(x);
	        //"guess" x is not in the subset
	        getSubsets(superSet, k, idx+1, current, solution);
	    }
	    
	    public static List<Set<Integer>> getSubsets(List<Integer> superSet, int k) {
	        List<Set<Integer>> res = new ArrayList<>();
	        getSubsets(superSet, k, 0, new HashSet<Integer>(), res);
	        return res;
	    }

	    public static void main(String args[]){
	    Scanner scanner = new Scanner(System.in);
	    int num_of_tests = scanner.nextInt();
	    for(int test=0;test<num_of_tests;test++){
	        int N = scanner.nextInt();
	        int K = scanner.nextInt();
	        int M = scanner.nextInt();
	        //int arr[] = new int[N];
	        List<Integer> superSet = new ArrayList<>();
	        for(int elem=0;elem<N;elem++){
	            //arr[elem] = scanner.nextInt();
	            superSet.add(scanner.nextInt());
	        }
	        List<Set<Integer>> subSets = getSubsets(superSet,K);

	        List<Set<Integer>> sortedSubSets = new ArrayList<>();
	        int min = 9999;
	        int sum = 0;
	        //finding sorted subSets
	        int len_set = subSets.size();
	        while(sortedSubSets.size()<len_set){
	            Set<Integer> temp_set = new HashSet<Integer>();
	            for(int index = 0;index<subSets.size(); index++){
	                for(int elem: subSets.get(index)){
	                    sum+=elem;
	                }
	                if(sum<min){
	                    min = sum;
	                    temp_set = subSets.get(index);
	                }
	                sum = 0;
	            }
	            min = 9999;
	            sortedSubSets.add(temp_set);
	            subSets.remove(temp_set);
	        }
	        Set<Integer> expected_subset = sortedSubSets.get(0);
	        Set<Integer> obtained_subset = sortedSubSets.get(M-1);
	        int expected_sum = 0;
	        int obtained_sum = 0;
	        for(int elem: expected_subset){
	            expected_sum+=elem;
	        }
	        for(int elem: obtained_subset){
	            obtained_sum+=elem;
	        }
	        int answer = obtained_sum - expected_sum;
	        System.out.println("Answer is: "+answer);
	        }

	    scanner.close();
	}
	}

