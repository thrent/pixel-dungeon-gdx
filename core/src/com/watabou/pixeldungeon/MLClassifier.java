/*
 * 
 */

package com.watabou.pixeldungeon;


import com.watabou.utils.Bundle;
import com.watabou.utils.Random;



class MLClassifier {
	
	public static class ExplorationClassifier {
		
		// Random forest proved to be 10% more accurate than the decision tree.
		
		private static int findMax(int[] nums) {
	        int index = 0;
	        for (int i = 0; i < nums.length; i++) {
	            index = nums[i] > nums[index] ? i : index;
	        }
	        return index;
	    }

	    public static int predict(double[] features) {
	        int[] classes = new int[3];
	            
	        if (features[4] <= 11.0) {
	            if (features[4] <= 2.5) {
	                if (features[3] <= 172.0) {
	                    if (features[3] <= 158.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 81; 
	                }
	            } else {
	                if (features[3] <= 1086.0) {
	                    if (features[14] <= 0.5) {
	                        classes[0] = 2; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 6; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 5; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[4] <= 16.0) {
	                if (features[8] <= 1.5) {
	                    classes[0] = 1; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 3; 
	                    classes[2] = 0; 
	                }
	            } else {
	                classes[0] = 22; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        }
	    
	        return findMax(classes);
	    }

	    public static int predictExploration(String[] input) {
	    	if (input.length == 23) {

	            // Features:
	            double[] features = new double[input.length];
	            for (int i = 0, l = input.length; i < l; i++) {
	                features[i] = Double.parseDouble(input[i]);
	            }

	            // Prediction:
	            int prediction = ExplorationClassifier.predict(features);
	            
	            return prediction;
	        }
	    	else {
	    		return 0;
	    	}
	    }
	}
	
	public static class ChallengeClassifier {
		
		// Decision tree proved to be more accurate than a Random Forest
		
		private static int findMax(int[] nums) {
	        int index = 0;
	        for (int i = 0; i < nums.length; i++) {
	            index = nums[i] > nums[index] ? i : index;
	        }
	        return index;
	    }

	    public static int predict(double[] features) {
	        int[] classes = new int[3];
	            
	        if (features[21] <= 109.0) {
	            if (features[20] <= 11.0) {
	                if (features[21] <= 21.0) {
	                    if (features[7] <= 104.5) {
	                        if (features[2] <= 18.5) {
	                            classes[0] = 0; 
	                            classes[1] = 27; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[11] <= 1.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 1; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    if (features[21] <= 64.0) {
	                        if (features[21] <= 48.5) {
	                            if (features[10] <= 0.5) {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                if (features[16] <= 42.5) {
	                    classes[0] = 17; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[20] <= 43.0) {
	                if (features[2] <= 18.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 57; 
	                } else {
	                    if (features[7] <= 10.0) {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                }
	            } else {
	                if (features[20] <= 476.5) {
	                    classes[0] = 5; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 1; 
	                }
	            }
	        }
	    
	        return findMax(classes);
	    }

	    public static int predictChallenge(String[] input) {
	    	if (input.length == 22) {

	            // Features:
	            double[] features = new double[input.length];
	            for (int i = 0, l = input.length; i < l; i++) {
	                features[i] = Double.parseDouble(input[i]);
	            }

	            // Prediction:
	            int predictionChallenge = ChallengeClassifier.predict(features);
	            
	            return predictionChallenge;
	        }
	    	else {
	    		return 0;
	    	}
	    }
		
	}
	
	public static class GameplayClassifier {
		
		// Decision tree proved to be more accurate than a Random Forest
		
		private static int findMax(int[] nums) {
	        int index = 0;
	        for (int i = 0; i < nums.length; i++) {
	            index = nums[i] > nums[index] ? i : index;
	        }
	        return index;
	    }

	    public static int predict(double[] features) {
	        int[] classes = new int[4];
	            
	        if (features[10] <= 3.5) {
	            if (features[8] <= 2.5) {
	                if (features[9] <= 1.5) {
	                    if (features[20] <= 129.5) {
	                        classes[0] = 35; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[14] <= 36.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        } else {
	                            classes[0] = 4; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[12] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 7; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[8] <= 1.0) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            } else {
	                if (features[9] <= 2.5) {
	                    if (features[6] <= 19.0) {
	                        if (features[17] <= 8.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 4; 
	                        } else {
	                            classes[0] = 3; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 11; 
	                    }
	                } else {
	                    if (features[6] <= 27.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 1; 
	                    }
	                }
	            }
	        } else {
	            if (features[8] <= 14.5) {
	                if (features[9] <= 3.5) {
	                    if (features[17] <= 36.5) {
	                        if (features[10] <= 4.5) {
	                            if (features[21] <= 45.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 37; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[6] <= 24.5) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        }
	                    }
	                } else {
	                    if (features[6] <= 26.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 5; 
	            }
	        }
	    
	        return findMax(classes);
	    }

	    public static int predictGameplay(String[] input) {
	    	if (input.length == 22) {

	            // Features:
	            double[] features = new double[input.length];
	            for (int i = 0, l = input.length; i < l; i++) {
	                features[i] = Double.parseDouble(input[i]);
	            }

	            // Prediction:
	            int predictionGameplay = GameplayClassifier.predict(features);
	            
	            return predictionGameplay;
	        }
	    	else {
	    		return 0;
	    	}
	    }
	}
}

