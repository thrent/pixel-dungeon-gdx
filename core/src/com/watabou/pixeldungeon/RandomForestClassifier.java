/*
 * 
 */

package com.watabou.pixeldungeon;


import com.watabou.utils.Bundle;
import com.watabou.utils.Random;



class RandomForestClassifier {
	
	public static class ExplorationClassifier {
		public static int predict_0(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[2] <= 16.0) {
	            classes[0] = 8; 
	            classes[1] = 0; 
	            classes[2] = 0; 
	        } else {
	            if (features[10] <= 5.5) {
	                if (features[6] <= 44.5) {
	                    if (features[4] <= 27.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 47; 
	                    } else {
	                        classes[0] = 10; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    if (features[9] <= 52.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 29; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                if (features[15] <= 0.5) {
	                    if (features[11] <= 20.0) {
	                        classes[0] = 5; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                } else {
	                    if (features[3] <= 1000.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 6; 
	                    } else {
	                        if (features[4] <= 2.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        } else {
	                            if (features[10] <= 11.5) {
	                                if (features[14] <= 2.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 8; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[9] <= 54.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_1(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[13] <= 9.5) {
	            if (features[7] <= 1.0) {
	                if (features[4] <= 3.0) {
	                    if (features[5] <= 59.0) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 12; 
	                    }
	                } else {
	                    classes[0] = 2; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[4] <= 21.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 52; 
	                } else {
	                    classes[0] = 5; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[5] <= 185.0) {
	                classes[0] = 6; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                if (features[8] <= 5.5) {
	                    if (features[11] <= 3.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 6; 
	                    } else {
	                        if (features[3] <= 764.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        } else {
	                            if (features[6] <= 58.5) {
	                                if (features[4] <= 6.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                } else {
	                                    classes[0] = 10; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    if (features[6] <= 43.0) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[4] <= 2.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 13; 
	                        } else {
	                            if (features[11] <= 23.5) {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_2(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[9] <= 53.5) {
	            if (features[7] <= 3.5) {
	                if (features[2] <= 16.0) {
	                    classes[0] = 6; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[5] <= 153.5) {
	                        if (features[13] <= 4.5) {
	                            if (features[4] <= 27.0) {
	                                if (features[15] <= 1.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                } else {
	                                    if (features[5] <= 59.0) {
	                                        if (features[3] <= 158.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 1; 
	                                        } else {
	                                            if (features[9] <= 0.5) {
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
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 5; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 10; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[2] <= 37.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 29; 
	                        } else {
	                            if (features[4] <= 9.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 9; 
	                            } else {
	                                if (features[15] <= 1.5) {
	                                    if (features[15] <= 0.5) {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        if (features[6] <= 43.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 2; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            if (features[18] <= 0.5) {
	                                                classes[0] = 0; 
	                                                classes[1] = 1; 
	                                                classes[2] = 0; 
	                                            } else {
	                                                classes[0] = 1; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                            }
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 3; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        }
	                    }
	                }
	            } else {
	                if (features[3] <= 1580.5) {
	                    if (features[5] <= 317.0) {
	                        classes[0] = 2; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[21] <= 1.0) {
	                            if (features[14] <= 1.5) {
	                                if (features[15] <= 0.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 27; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[4] <= 16.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    } else {
	                        classes[0] = 3; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[10] <= 6.0) {
	                classes[0] = 0; 
	                classes[1] = 5; 
	                classes[2] = 0; 
	            } else {
	                if (features[4] <= 20.0) {
	                    classes[0] = 0; 
	                    classes[1] = 2; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 1; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_3(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[14] <= 4.5) {
	            if (features[1] <= 16.0) {
	                classes[0] = 5; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                if (features[4] <= 8.0) {
	                    if (features[2] <= 51.0) {
	                        if (features[3] <= 172.0) {
	                            if (features[9] <= 0.5) {
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
	                            classes[2] = 71; 
	                        }
	                    } else {
	                        if (features[4] <= 1.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 14; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[21] <= 0.5) {
	                        if (features[0] <= 12.5) {
	                            classes[0] = 19; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        } else {
	            classes[0] = 5; 
	            classes[1] = 0; 
	            classes[2] = 0; 
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_4(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[12] <= 3.5) {
	            if (features[8] <= 1.0) {
	                if (features[15] <= 1.5) {
	                    if (features[4] <= 3.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                    } else {
	                        classes[0] = 7; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    if (features[3] <= 158.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    } else {
	                        if (features[5] <= 59.0) {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                        }
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 7; 
	            }
	        } else {
	            if (features[19] <= 0.5) {
	                if (features[11] <= 25.5) {
	                    if (features[5] <= 191.0) {
	                        classes[0] = 8; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[11] <= 15.5) {
	                            if (features[10] <= 10.5) {
	                                if (features[0] <= 3.5) {
	                                    if (features[3] <= 833.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 21; 
	                                    } else {
	                                        if (features[21] <= 0.5) {
	                                            if (features[16] <= 0.5) {
	                                                classes[0] = 0; 
	                                                classes[1] = 0; 
	                                                classes[2] = 1; 
	                                            } else {
	                                                classes[0] = 2; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                            }
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 34; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            if (features[4] <= 7.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 5; 
	                            } else {
	                                classes[0] = 4; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 3; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[9] <= 44.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 20; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_5(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[9] <= 40.5) {
	            if (features[1] <= 16.0) {
	                classes[0] = 5; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                if (features[11] <= 3.5) {
	                    if (features[0] <= 2.5) {
	                        if (features[10] <= 0.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 19; 
	                        } else {
	                            if (features[7] <= 2.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 2; 
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 38; 
	                    }
	                } else {
	                    if (features[10] <= 5.5) {
	                        if (features[3] <= 1859.5) {
	                            if (features[9] <= 1.0) {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[5] <= 392.5) {
	                                    if (features[15] <= 0.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                    } else {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 17; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[4] <= 7.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 7; 
	                        } else {
	                            if (features[3] <= 1419.0) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                }
	            }
	        } else {
	            if (features[18] <= 0.5) {
	                if (features[5] <= 863.0) {
	                    if (features[1] <= 39.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    } else {
	                        if (features[3] <= 1110.0) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 7; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[6] <= 77.0) {
	                        classes[0] = 0; 
	                        classes[1] = 5; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 4; 
	                    }
	                }
	            } else {
	                if (features[17] <= 0.5) {
	                    classes[0] = 0; 
	                    classes[1] = 5; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 1; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_6(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[5] <= 148.0) {
	            if (features[4] <= 2.0) {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 3; 
	            } else {
	                classes[0] = 14; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[1] <= 37.0) {
	                if (features[4] <= 22.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 70; 
	                } else {
	                    classes[0] = 1; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[3] <= 1606.5) {
	                    if (features[4] <= 9.5) {
	                        if (features[0] <= 17.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 17; 
	                        } else {
	                            if (features[0] <= 20.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 4; 
	                            }
	                        }
	                    } else {
	                        if (features[15] <= 1.5) {
	                            if (features[8] <= 9.5) {
	                                if (features[4] <= 31.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 3; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    classes[0] = 4; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_7(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[3] <= 1244.0) {
	            if (features[15] <= 0.5) {
	                if (features[9] <= 11.5) {
	                    if (features[4] <= 26.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 4; 
	                    } else {
	                        classes[0] = 3; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 7; 
	                }
	            } else {
	                if (features[9] <= 35.0) {
	                    if (features[14] <= 0.5) {
	                        if (features[4] <= 1.0) {
	                            if (features[15] <= 1.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 9; 
	                            } else {
	                                if (features[5] <= 59.0) {
	                                    if (features[5] <= 48.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 2; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        }
	                    } else {
	                        if (features[4] <= 25.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 52; 
	                        } else {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[4] <= 7.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[1] <= 23.0) {
	                classes[0] = 5; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                if (features[21] <= 0.5) {
	                    if (features[8] <= 5.5) {
	                        classes[0] = 0; 
	                        classes[1] = 6; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[11] <= 21.0) {
	                            if (features[6] <= 72.0) {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[6] <= 78.5) {
	                                    if (features[0] <= 17.0) {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 4; 
	                                    }
	                                } else {
	                                    classes[0] = 3; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        } else {
	                            if (features[15] <= 2.0) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 4; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 2; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_8(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[6] <= 74.0) {
	            if (features[3] <= 177.5) {
	                classes[0] = 0; 
	                classes[1] = 2; 
	                classes[2] = 0; 
	            } else {
	                if (features[11] <= 2.5) {
	                    if (features[2] <= 16.0) {
	                        if (features[4] <= 3.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                        } else {
	                            classes[0] = 5; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[6] <= 32.5) {
	                            if (features[12] <= 3.5) {
	                                if (features[11] <= 0.5) {
	                                    if (features[3] <= 452.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                    } else {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 17; 
	                            }
	                        } else {
	                            if (features[15] <= 0.5) {
	                                if (features[3] <= 615.0) {
	                                    classes[0] = 7; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[0] <= 10.0) {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                    }
	                                }
	                            } else {
	                                if (features[13] <= 9.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 22; 
	                                } else {
	                                    if (features[5] <= 427.0) {
	                                        classes[0] = 3; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                    }
	                                }
	                            }
	                        }
	                    }
	                } else {
	                    if (features[3] <= 895.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 22; 
	                    } else {
	                        if (features[19] <= 0.5) {
	                            if (features[11] <= 19.0) {
	                                if (features[4] <= 12.5) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[9] <= 19.0) {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 3; 
	                                        classes[2] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 4; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 7; 
	                        }
	                    }
	                }
	            }
	        } else {
	            if (features[5] <= 1188.5) {
	                if (features[9] <= 31.5) {
	                    if (features[0] <= 17.0) {
	                        classes[0] = 9; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                } else {
	                    if (features[21] <= 0.5) {
	                        classes[0] = 1; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 2; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_9(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[5] <= 1112.0) {
	            if (features[2] <= 16.0) {
	                if (features[4] <= 3.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 1; 
	                } else {
	                    classes[0] = 4; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[10] <= 10.5) {
	                    if (features[10] <= 1.5) {
	                        if (features[4] <= 29.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 60; 
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[4] <= 18.0) {
	                            if (features[14] <= 2.5) {
	                                if (features[1] <= 49.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 26; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                if (features[9] <= 52.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 8; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 9; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[10] <= 11.5) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 2; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        } else {
	            classes[0] = 0; 
	            classes[1] = 4; 
	            classes[2] = 0; 
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict(double[] features) {
	        int n_classes = 3;
	        int[] classes = new int[n_classes];
	        classes[ExplorationClassifier.predict_0(features)]++;
	        classes[ExplorationClassifier.predict_1(features)]++;
	        classes[ExplorationClassifier.predict_2(features)]++;
	        classes[ExplorationClassifier.predict_3(features)]++;
	        classes[ExplorationClassifier.predict_4(features)]++;
	        classes[ExplorationClassifier.predict_5(features)]++;
	        classes[ExplorationClassifier.predict_6(features)]++;
	        classes[ExplorationClassifier.predict_7(features)]++;
	        classes[ExplorationClassifier.predict_8(features)]++;
	        classes[ExplorationClassifier.predict_9(features)]++;
	    
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < n_classes; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }

	    /**
	    public static void main(String[] args) {
	        if (true) {

	            // Features:
	            double[] features = new double[args.length];
	            for (int i = 0, l = args.length; i < l; i++) {
	                features[i] = Double.parseDouble(args[i]);
	            }
	            
	            double[] input = {5,32,
						32,600,99,
				        750,34,3,
				        5,2,2, 4,
				        7,9,2,2,
				       1,1,0,0, 
				        0,0,0};

	            // Prediction:
	            int prediction = ExplorationClassifier.predict(input);
	            System.out.println(prediction);

	        }
	    }
	    **/

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
		
		public static int predict_0(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[20] <= 11.0) {
	            if (features[10] <= 7.5) {
	                if (features[4] <= 11.0) {
	                    if (features[7] <= 21.5) {
	                        if (features[21] <= 121.5) {
	                            classes[0] = 0; 
	                            classes[1] = 5; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 6; 
	                    }
	                } else {
	                    if (features[13] <= 0.5) {
	                        if (features[6] <= 14.5) {
	                            if (features[2] <= 18.5) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 9; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[6] <= 19.0) {
	                            if (features[11] <= 0.5) {
	                                if (features[8] <= 0.5) {
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
	                                classes[1] = 16; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            if (features[17] <= 16.5) {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[4] <= 20.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 6; 
	                                } else {
	                                    if (features[7] <= 46.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 3; 
	                                    } else {
	                                        if (features[19] <= 66.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 5; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 1; 
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            } else {
	                if (features[6] <= 30.5) {
	                    if (features[17] <= 36.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 29; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 2; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[19] <= 80.5) {
	                classes[0] = 25; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 2; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_1(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[17] <= 28.5) {
	            if (features[20] <= 11.0) {
	                if (features[0] <= 1.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 10; 
	                } else {
	                    if (features[2] <= 10.5) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[17] <= 22.0) {
	                            if (features[4] <= 21.5) {
	                                if (features[16] <= 16.0) {
	                                    if (features[0] <= 11.5) {
	                                        if (features[19] <= 12.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 3; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            if (features[9] <= 3.0) {
	                                                if (features[1] <= 5.0) {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 0; 
	                                                    classes[2] = 13; 
	                                                } else {
	                                                    if (features[21] <= 79.5) {
	                                                        classes[0] = 0; 
	                                                        classes[1] = 2; 
	                                                        classes[2] = 0; 
	                                                    } else {
	                                                        classes[0] = 0; 
	                                                        classes[1] = 0; 
	                                                        classes[2] = 8; 
	                                                    }
	                                                }
	                                            } else {
	                                                classes[0] = 0; 
	                                                classes[1] = 1; 
	                                                classes[2] = 0; 
	                                            }
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    if (features[5] <= 23.0) {
	                                        if (features[5] <= 1.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 3; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 4; 
	                                        classes[2] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            if (features[21] <= 27.0) {
	                                if (features[17] <= 27.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[14] <= 236.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 3; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 23; 
	                            }
	                        }
	                    }
	                }
	            } else {
	                if (features[16] <= 40.0) {
	                    classes[0] = 16; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[2] <= 18.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[7] <= 51.0) {
	                if (features[19] <= 83.5) {
	                    if (features[19] <= 17.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    } else {
	                        if (features[7] <= 39.0) {
	                            if (features[8] <= 3.0) {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 5; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[14] <= 217.5) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                }
	            } else {
	                if (features[11] <= 3.5) {
	                    if (features[14] <= 272.0) {
	                        classes[0] = 0; 
	                        classes[1] = 6; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                } else {
	                    if (features[13] <= 7.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_2(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[21] <= 110.0) {
	            if (features[15] <= 0.5) {
	                if (features[6] <= 30.5) {
	                    if (features[8] <= 3.0) {
	                        if (features[20] <= 25.5) {
	                            if (features[14] <= 184.0) {
	                                if (features[13] <= 2.5) {
	                                    if (features[19] <= 56.0) {
	                                        if (features[13] <= 1.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 11; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 2; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 7; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 3; 
	                            }
	                        } else {
	                            classes[0] = 6; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[9] <= 4.5) {
	                            classes[0] = 0; 
	                            classes[1] = 23; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 3; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    classes[0] = 3; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[3] <= 23.5) {
	                    classes[0] = 12; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[18] <= 1.5) {
	                if (features[20] <= 43.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 40; 
	                } else {
	                    if (features[19] <= 81.0) {
	                        classes[0] = 5; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                }
	            } else {
	                if (features[2] <= 17.0) {
	                    classes[0] = 2; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 1; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_3(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[20] <= 11.0) {
	            if (features[10] <= 5.5) {
	                if (features[4] <= 27.5) {
	                    if (features[12] <= 4.5) {
	                        if (features[10] <= 1.5) {
	                            if (features[19] <= 38.5) {
	                                if (features[2] <= 15.5) {
	                                    if (features[12] <= 3.5) {
	                                        if (features[21] <= 76.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 14; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                if (features[17] <= 39.5) {
	                                    if (features[10] <= 0.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 6; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        if (features[12] <= 0.5) {
	                                            if (features[14] <= 17.0) {
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
	                                            classes[1] = 3; 
	                                            classes[2] = 0; 
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                }
	                            }
	                        } else {
	                            if (features[16] <= 10.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 2; 
	                            } else {
	                                if (features[19] <= 25.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                }
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 6; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 14; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[21] <= 78.0) {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 33; 
	                }
	            }
	        } else {
	            classes[0] = 32; 
	            classes[1] = 0; 
	            classes[2] = 0; 
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_4(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[12] <= 0.5) {
	            if (features[5] <= 11.5) {
	                if (features[10] <= 0.5) {
	                    if (features[21] <= 151.0) {
	                        if (features[19] <= 3.0) {
	                            if (features[2] <= 18.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 5; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                    }
	                } else {
	                    if (features[1] <= 12.0) {
	                        if (features[19] <= 13.5) {
	                            if (features[5] <= 5.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 6; 
	                        }
	                    } else {
	                        classes[0] = 1; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                if (features[16] <= 7.0) {
	                    classes[0] = 1; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 9; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[21] <= 52.5) {
	                if (features[20] <= 71.5) {
	                    if (features[14] <= 227.5) {
	                        classes[0] = 0; 
	                        classes[1] = 20; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[3] <= 28.5) {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[0] <= 21.5) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 2; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 7; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[15] <= 1.0) {
	                    if (features[4] <= 12.5) {
	                        if (features[11] <= 5.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 21; 
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 33; 
	                    }
	                } else {
	                    classes[0] = 2; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_5(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[20] <= 25.5) {
	            if (features[21] <= 52.5) {
	                if (features[7] <= 12.0) {
	                    if (features[5] <= 34.0) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 27; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[2] <= 18.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 69; 
	                } else {
	                    if (features[7] <= 10.0) {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                    }
	                }
	            }
	        } else {
	            if (features[19] <= 81.0) {
	                classes[0] = 17; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 1; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_6(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[0] <= 3.5) {
	            if (features[11] <= 5.0) {
	                if (features[6] <= 11.5) {
	                    if (features[21] <= 27.0) {
	                        if (features[8] <= 0.5) {
	                            classes[0] = 7; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[19] <= 8.5) {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 36; 
	                    }
	                } else {
	                    classes[0] = 2; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 1; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[14] <= 148.0) {
	                if (features[1] <= 7.0) {
	                    if (features[7] <= 16.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 6; 
	                    } else {
	                        if (features[3] <= 14.5) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[11] <= 2.0) {
	                                if (features[2] <= 12.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    if (features[20] <= 81.0) {
	                        if (features[8] <= 8.5) {
	                            if (features[17] <= 24.5) {
	                                classes[0] = 0; 
	                                classes[1] = 14; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[0] <= 10.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 3; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[12] <= 0.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 2; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                    }
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                        }
	                    } else {
	                        classes[0] = 3; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                if (features[1] <= 18.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 11; 
	                } else {
	                    if (features[17] <= 34.5) {
	                        if (features[1] <= 20.0) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[14] <= 224.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 12; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 7; 
	                        classes[2] = 0; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_7(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[10] <= 6.5) {
	            if (features[3] <= 16.0) {
	                if (features[14] <= 27.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 14; 
	                } else {
	                    if (features[20] <= 43.0) {
	                        if (features[16] <= 16.0) {
	                            if (features[16] <= 6.5) {
	                                if (features[19] <= 18.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 2; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 5; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        }
	                    } else {
	                        classes[0] = 4; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                if (features[5] <= 36.5) {
	                    if (features[4] <= 18.5) {
	                        if (features[0] <= 9.0) {
	                            classes[0] = 0; 
	                            classes[1] = 18; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[9] <= 0.5) {
	                                if (features[19] <= 45.5) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 2; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    } else {
	                        if (features[0] <= 11.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        } else {
	                            if (features[5] <= 17.5) {
	                                if (features[14] <= 73.5) {
	                                    if (features[5] <= 0.5) {
	                                        if (features[16] <= 42.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            if (features[21] <= 21.0) {
	                                                classes[0] = 0; 
	                                                classes[1] = 1; 
	                                                classes[2] = 0; 
	                                            } else {
	                                                classes[0] = 1; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                            }
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 8; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                if (features[7] <= 30.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[21] <= 314.0) {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 3; 
	                                    }
	                                }
	                            }
	                        }
	                    }
	                } else {
	                    if (features[6] <= 25.0) {
	                        if (features[7] <= 81.0) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 7; 
	                    }
	                }
	            }
	        } else {
	            if (features[8] <= 2.0) {
	                classes[0] = 0; 
	                classes[1] = 3; 
	                classes[2] = 0; 
	            } else {
	                if (features[21] <= 78.0) {
	                    classes[0] = 0; 
	                    classes[1] = 2; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[8] <= 3.5) {
	                        if (features[9] <= 2.5) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 29; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_8(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[0] <= 1.5) {
	            if (features[5] <= 4.0) {
	                classes[0] = 0; 
	                classes[1] = 2; 
	                classes[2] = 0; 
	            } else {
	                if (features[10] <= 6.5) {
	                    if (features[21] <= 130.0) {
	                        if (features[10] <= 3.0) {
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
	                    classes[1] = 0; 
	                    classes[2] = 16; 
	                }
	            }
	        } else {
	            if (features[21] <= 48.0) {
	                if (features[15] <= 0.5) {
	                    if (features[0] <= 8.5) {
	                        classes[0] = 0; 
	                        classes[1] = 8; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[0] <= 13.5) {
	                            if (features[19] <= 86.5) {
	                                classes[0] = 7; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            if (features[6] <= 30.5) {
	                                if (features[11] <= 0.5) {
	                                    if (features[1] <= 25.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 11; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 10; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[15] <= 0.5) {
	                    if (features[9] <= 2.5) {
	                        if (features[3] <= 24.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 27; 
	                        } else {
	                            if (features[0] <= 20.5) {
	                                if (features[18] <= 1.0) {
	                                    if (features[12] <= 4.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 7; 
	                                    } else {
	                                        if (features[14] <= 505.5) {
	                                            if (features[11] <= 4.0) {
	                                                classes[0] = 0; 
	                                                classes[1] = 0; 
	                                                classes[2] = 2; 
	                                            } else {
	                                                classes[0] = 1; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                            }
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 4; 
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    } else {
	                        if (features[17] <= 18.5) {
	                            classes[0] = 5; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 4; 
	                        }
	                    }
	                } else {
	                    classes[0] = 4; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_9(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[21] <= 48.5) {
	            if (features[7] <= 16.5) {
	                if (features[1] <= 13.5) {
	                    if (features[12] <= 0.5) {
	                        classes[0] = 9; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[2] <= 12.5) {
	                            classes[0] = 4; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[2] <= 18.5) {
	                        classes[0] = 0; 
	                        classes[1] = 6; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                }
	            } else {
	                if (features[3] <= 28.5) {
	                    if (features[14] <= 137.0) {
	                        if (features[20] <= 58.0) {
	                            classes[0] = 0; 
	                            classes[1] = 16; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 3; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 8; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 8; 
	                    classes[2] = 0; 
	                }
	            }
	        } else {
	            if (features[20] <= 81.0) {
	                if (features[8] <= 1.5) {
	                    if (features[12] <= 0.5) {
	                        if (features[5] <= 2.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 4; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 12; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 44; 
	                }
	            } else {
	                classes[0] = 3; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_10(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[20] <= 32.0) {
	            if (features[16] <= 42.5) {
	                if (features[3] <= 33.5) {
	                    if (features[10] <= 2.5) {
	                        if (features[19] <= 97.5) {
	                            if (features[10] <= 0.5) {
	                                if (features[2] <= 12.5) {
	                                    if (features[1] <= 3.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 8; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 4; 
	                                        classes[2] = 0; 
	                                    }
	                                } else {
	                                    if (features[13] <= 0.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 14; 
	                                    }
	                                }
	                            } else {
	                                if (features[21] <= 48.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 11; 
	                                    classes[2] = 0; 
	                                } else {
	                                    if (features[0] <= 8.5) {
	                                        if (features[6] <= 17.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 5; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 9; 
	                                    }
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[19] <= 7.0) {
	                            if (features[21] <= 118.5) {
	                                if (features[8] <= 1.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 5; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 26; 
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 2; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[7] <= 90.0) {
	                    if (features[6] <= 14.5) {
	                        if (features[1] <= 25.0) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 4; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 1; 
	                }
	            }
	        } else {
	            if (features[2] <= 18.5) {
	                classes[0] = 23; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 1; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_11(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[5] <= 4.0) {
	            if (features[21] <= 52.5) {
	                if (features[20] <= 25.5) {
	                    classes[0] = 0; 
	                    classes[1] = 10; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 8; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                if (features[16] <= 7.0) {
	                    classes[0] = 0; 
	                    classes[1] = 2; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[12] <= 1.0) {
	                        if (features[7] <= 14.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 4; 
	                    }
	                }
	            }
	        } else {
	            if (features[20] <= 45.0) {
	                if (features[21] <= 27.0) {
	                    if (features[6] <= 30.5) {
	                        if (features[7] <= 13.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 20; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 2; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 64; 
	                }
	            } else {
	                if (features[8] <= 12.0) {
	                    classes[0] = 6; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 1; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_12(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[21] <= 48.5) {
	            if (features[20] <= 11.0) {
	                if (features[16] <= 32.5) {
	                    classes[0] = 0; 
	                    classes[1] = 22; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[1] <= 20.5) {
	                        classes[0] = 3; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[14] <= 19.5) {
	                            if (features[2] <= 18.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 6; 
	                            classes[2] = 0; 
	                        }
	                    }
	                }
	            } else {
	                classes[0] = 24; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[20] <= 43.0) {
	                if (features[12] <= 0.5) {
	                    if (features[3] <= 21.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 7; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 53; 
	                }
	            } else {
	                classes[0] = 4; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_13(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[21] <= 27.0) {
	            if (features[20] <= 11.0) {
	                if (features[5] <= 36.5) {
	                    classes[0] = 0; 
	                    classes[1] = 35; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[6] <= 30.5) {
	                        if (features[19] <= 73.0) {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                        }
	                    } else {
	                        classes[0] = 2; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                classes[0] = 14; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[7] <= 5.5) {
	                classes[0] = 0; 
	                classes[1] = 3; 
	                classes[2] = 0; 
	            } else {
	                if (features[15] <= 0.5) {
	                    if (features[11] <= 4.5) {
	                        if (features[1] <= 24.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 45; 
	                        } else {
	                            if (features[12] <= 1.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 4; 
	                            }
	                        }
	                    } else {
	                        if (features[3] <= 17.5) {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[1] <= 20.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 6; 
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 4; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_14(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[5] <= 4.0) {
	            if (features[4] <= 17.5) {
	                if (features[20] <= 32.0) {
	                    if (features[16] <= 14.5) {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[1] <= 8.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                        } else {
	                            if (features[9] <= 0.5) {
	                                if (features[2] <= 13.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 7; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 12; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[9] <= 0.5) {
	                if (features[19] <= 76.0) {
	                    if (features[12] <= 0.5) {
	                        classes[0] = 0; 
	                        classes[1] = 7; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[21] <= 27.0) {
	                            if (features[20] <= 45.0) {
	                                classes[0] = 0; 
	                                classes[1] = 16; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[1] <= 22.0) {
	                                    classes[0] = 3; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 18; 
	                        }
	                    }
	                } else {
	                    if (features[0] <= 10.0) {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[8] <= 1.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                        } else {
	                            classes[0] = 5; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                }
	            } else {
	                if (features[21] <= 62.0) {
	                    if (features[20] <= 115.0) {
	                        classes[0] = 0; 
	                        classes[1] = 5; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 5; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 29; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_15(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[15] <= 0.5) {
	            if (features[0] <= 5.5) {
	                if (features[10] <= 4.5) {
	                    if (features[21] <= 107.0) {
	                        if (features[14] <= 39.5) {
	                            if (features[4] <= 5.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[9] <= 0.5) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 7; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 13; 
	                    }
	                } else {
	                    if (features[21] <= 27.0) {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 18; 
	                    }
	                }
	            } else {
	                if (features[21] <= 124.0) {
	                    if (features[21] <= 48.5) {
	                        if (features[6] <= 30.5) {
	                            if (features[8] <= 1.5) {
	                                if (features[20] <= 32.0) {
	                                    if (features[19] <= 68.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 13; 
	                                        classes[2] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                    }
	                                } else {
	                                    classes[0] = 4; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 13; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 3; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[14] <= 8.0) {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                        } else {
	                            if (features[3] <= 19.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 3; 
	                            }
	                        }
	                    }
	                } else {
	                    if (features[13] <= 0.5) {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    } else {
	                        if (features[21] <= 392.0) {
	                            if (features[8] <= 9.5) {
	                                if (features[14] <= 41.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 5; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 18; 
	                        }
	                    }
	                }
	            }
	        } else {
	            classes[0] = 13; 
	            classes[1] = 0; 
	            classes[2] = 0; 
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_16(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[5] <= 8.5) {
	            if (features[19] <= 45.5) {
	                if (features[20] <= 11.0) {
	                    if (features[0] <= 7.5) {
	                        if (features[14] <= 2.0) {
	                            if (features[7] <= 5.5) {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 4; 
	                        }
	                    } else {
	                        if (features[5] <= 0.5) {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 5; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    classes[0] = 17; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 11; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[15] <= 0.5) {
	                if (features[3] <= 11.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 14; 
	                } else {
	                    if (features[20] <= 113.5) {
	                        if (features[9] <= 0.5) {
	                            if (features[6] <= 6.5) {
	                                classes[0] = 0; 
	                                classes[1] = 4; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[5] <= 23.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 6; 
	                                } else {
	                                    if (features[7] <= 20.0) {
	                                        if (features[19] <= 58.0) {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 4; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 11; 
	                                        classes[2] = 0; 
	                                    }
	                                }
	                            }
	                        } else {
	                            if (features[19] <= 30.5) {
	                                if (features[14] <= 50.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                }
	                            } else {
	                                if (features[17] <= 42.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 25; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        }
	                    } else {
	                        classes[0] = 5; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                    }
	                }
	            } else {
	                classes[0] = 6; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_17(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[21] <= 48.5) {
	            if (features[20] <= 11.0) {
	                if (features[14] <= 227.5) {
	                    classes[0] = 0; 
	                    classes[1] = 25; 
	                    classes[2] = 0; 
	                } else {
	                    if (features[19] <= 73.0) {
	                        if (features[13] <= 5.5) {
	                            if (features[3] <= 31.5) {
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
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                    }
	                }
	            } else {
	                classes[0] = 24; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        } else {
	            if (features[0] <= 20.5) {
	                if (features[14] <= 2.0) {
	                    if (features[4] <= 5.0) {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                    }
	                } else {
	                    if (features[10] <= 20.5) {
	                        if (features[13] <= 0.5) {
	                            if (features[14] <= 21.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 8; 
	                            } else {
	                                if (features[5] <= 7.0) {
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
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 48; 
	                        }
	                    } else {
	                        if (features[7] <= 71.5) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 5; 
	                        }
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 1; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_18(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[15] <= 0.5) {
	            if (features[20] <= 45.0) {
	                if (features[21] <= 95.0) {
	                    if (features[14] <= 22.5) {
	                        if (features[4] <= 16.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                        } else {
	                            if (features[0] <= 15.5) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[17] <= 36.0) {
	                                    classes[0] = 2; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                }
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 26; 
	                        classes[2] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 65; 
	                }
	            } else {
	                classes[0] = 11; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            }
	        } else {
	            classes[0] = 10; 
	            classes[1] = 0; 
	            classes[2] = 0; 
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_19(double[] features) {
	        int[] classes = new int[3];
	        
	        if (features[15] <= 0.5) {
	            if (features[7] <= 112.5) {
	                if (features[21] <= 107.0) {
	                    if (features[7] <= 12.0) {
	                        if (features[19] <= 54.0) {
	                            if (features[17] <= 36.5) {
	                                classes[0] = 0; 
	                                classes[1] = 5; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[21] <= 31.0) {
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
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 4; 
	                        }
	                    } else {
	                        if (features[6] <= 30.5) {
	                            if (features[20] <= 102.5) {
	                                classes[0] = 0; 
	                                classes[1] = 18; 
	                                classes[2] = 0; 
	                            } else {
	                                classes[0] = 4; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            }
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[13] <= 4.5) {
	                        if (features[20] <= 81.0) {
	                            if (features[6] <= 27.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 46; 
	                            } else {
	                                if (features[11] <= 1.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 5; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                        }
	                    } else {
	                        if (features[21] <= 583.5) {
	                            if (features[10] <= 6.0) {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                            } else {
	                                if (features[20] <= 418.0) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 4; 
	                        }
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 17; 
	            }
	        } else {
	            if (features[7] <= 36.5) {
	                classes[0] = 8; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 1; 
	                classes[2] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 3; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict(double[] features) {
	        int n_classes = 3;
	        int[] classes = new int[n_classes];
	        classes[ChallengeClassifier.predict_0(features)]++;
	        classes[ChallengeClassifier.predict_1(features)]++;
	        classes[ChallengeClassifier.predict_2(features)]++;
	        classes[ChallengeClassifier.predict_3(features)]++;
	        classes[ChallengeClassifier.predict_4(features)]++;
	        classes[ChallengeClassifier.predict_5(features)]++;
	        classes[ChallengeClassifier.predict_6(features)]++;
	        classes[ChallengeClassifier.predict_7(features)]++;
	        classes[ChallengeClassifier.predict_8(features)]++;
	        classes[ChallengeClassifier.predict_9(features)]++;
	        classes[ChallengeClassifier.predict_10(features)]++;
	        classes[ChallengeClassifier.predict_11(features)]++;
	        classes[ChallengeClassifier.predict_12(features)]++;
	        classes[ChallengeClassifier.predict_13(features)]++;
	        classes[ChallengeClassifier.predict_14(features)]++;
	        classes[ChallengeClassifier.predict_15(features)]++;
	        classes[ChallengeClassifier.predict_16(features)]++;
	        classes[ChallengeClassifier.predict_17(features)]++;
	        classes[ChallengeClassifier.predict_18(features)]++;
	        classes[ChallengeClassifier.predict_19(features)]++;
	    
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < n_classes; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
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
		
		public static int predict_0(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[8] <= 1.5) {
	            if (features[7] <= 33.5) {
	                if (features[4] <= 3.0) {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[9] <= 2.0) {
	                        classes[0] = 33; 
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
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 2; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[14] <= 97.0) {
	                if (features[10] <= 3.5) {
	                    if (features[6] <= 11.5) {
	                        if (features[8] <= 2.5) {
	                            if (features[19] <= 13.5) {
	                                if (features[20] <= 71.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                }
	                            } else {
	                                classes[0] = 4; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 4; 
	                        }
	                    } else {
	                        if (features[16] <= 14.5) {
	                            if (features[13] <= 3.0) {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 6; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[11] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 23; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[7] <= 22.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 4; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            } else {
	                if (features[7] <= 37.0) {
	                    if (features[2] <= 18.5) {
	                        classes[0] = 0; 
	                        classes[1] = 5; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 2; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[2] <= 16.5) {
	                        if (features[11] <= 3.5) {
	                            if (features[19] <= 77.5) {
	                                classes[0] = 0; 
	                                classes[1] = 4; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 2; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[21] <= 941.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 6; 
	                            } else {
	                                if (features[9] <= 5.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
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
	                        if (features[9] <= 5.5) {
	                            if (features[1] <= 21.5) {
	                                if (features[13] <= 3.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                } else {
	                                    if (features[8] <= 7.0) {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
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
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 11; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_1(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[7] <= 21.5) {
	            if (features[20] <= 369.5) {
	                if (features[0] <= 1.5) {
	                    if (features[11] <= 0.5) {
	                        if (features[16] <= 5.0) {
	                            classes[0] = 0; 
	                            classes[1] = 5; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[11] <= 4.5) {
	                        if (features[9] <= 0.5) {
	                            if (features[2] <= 13.5) {
	                                if (features[19] <= 35.5) {
	                                    classes[0] = 9; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[12] <= 1.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 2; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        if (features[5] <= 10.5) {
	                                            if (features[21] <= 234.0) {
	                                                classes[0] = 1; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                                classes[3] = 0; 
	                                            } else {
	                                                classes[0] = 0; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                                classes[3] = 1; 
	                                            }
	                                        } else {
	                                            classes[0] = 4; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        }
	                                    }
	                                }
	                            } else {
	                                classes[0] = 16; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[16] <= 25.0) {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[16] <= 35.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 3; 
	                                }
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 4; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[20] <= 561.5) {
	                if (features[5] <= 41.5) {
	                    if (features[14] <= 54.0) {
	                        if (features[8] <= 2.5) {
	                            if (features[12] <= 0.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 5; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[7] <= 37.0) {
	                                classes[0] = 0; 
	                                classes[1] = 8; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[19] <= 49.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 3; 
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
	                        if (features[5] <= 20.0) {
	                            if (features[7] <= 31.0) {
	                                if (features[16] <= 24.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 5; 
	                            }
	                        } else {
	                            if (features[1] <= 12.5) {
	                                if (features[16] <= 7.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[2] <= 12.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 3; 
	                                    } else {
	                                        if (features[17] <= 12.0) {
	                                            classes[0] = 3; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 4; 
	                                        }
	                                    }
	                                }
	                            } else {
	                                if (features[10] <= 6.0) {
	                                    if (features[9] <= 2.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 1; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    if (features[20] <= 418.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 15; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 2; 
	                                    }
	                                }
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 8; 
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 4; 
	                classes[3] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_2(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[18] <= 0.5) {
	            if (features[0] <= 19.0) {
	                if (features[6] <= 1.5) {
	                    if (features[17] <= 22.0) {
	                        if (features[21] <= 33.0) {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[14] <= 2.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 2; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 10; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[7] <= 34.5) {
	                        if (features[10] <= 3.0) {
	                            if (features[3] <= 5.5) {
	                                if (features[11] <= 0.5) {
	                                    if (features[12] <= 0.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 2; 
	                                    } else {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 5; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                if (features[16] <= 10.5) {
	                                    if (features[5] <= 21.0) {
	                                        classes[0] = 17; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    if (features[6] <= 8.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 2; 
	                                    } else {
	                                        if (features[14] <= 43.0) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 1; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 2; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        }
	                                    }
	                                }
	                            }
	                        } else {
	                            if (features[14] <= 29.0) {
	                                classes[0] = 0; 
	                                classes[1] = 10; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[12] <= 2.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 2; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        }
	                    } else {
	                        if (features[20] <= 561.5) {
	                            if (features[17] <= 36.5) {
	                                if (features[8] <= 14.5) {
	                                    if (features[16] <= 16.0) {
	                                        if (features[5] <= 30.0) {
	                                            if (features[16] <= 8.5) {
	                                                classes[0] = 0; 
	                                                classes[1] = 0; 
	                                                classes[2] = 1; 
	                                                classes[3] = 0; 
	                                            } else {
	                                                if (features[21] <= 852.5) {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 0; 
	                                                    classes[2] = 0; 
	                                                    classes[3] = 4; 
	                                                } else {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 1; 
	                                                    classes[2] = 0; 
	                                                    classes[3] = 0; 
	                                                }
	                                            }
	                                        } else {
	                                            if (features[11] <= 2.5) {
	                                                classes[0] = 1; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                                classes[3] = 0; 
	                                            } else {
	                                                classes[0] = 0; 
	                                                classes[1] = 2; 
	                                                classes[2] = 0; 
	                                                classes[3] = 0; 
	                                            }
	                                        }
	                                    } else {
	                                        if (features[8] <= 2.5) {
	                                            classes[0] = 1; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            if (features[8] <= 5.0) {
	                                                if (features[1] <= 13.0) {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 1; 
	                                                    classes[2] = 0; 
	                                                    classes[3] = 0; 
	                                                } else {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 0; 
	                                                    classes[2] = 1; 
	                                                    classes[3] = 0; 
	                                                }
	                                            } else {
	                                                classes[0] = 0; 
	                                                classes[1] = 12; 
	                                                classes[2] = 0; 
	                                                classes[3] = 0; 
	                                            }
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 5; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 3; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 4; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            } else {
	                classes[0] = 10; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[21] <= 174.5) {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 11; 
	            } else {
	                if (features[3] <= 30.0) {
	                    classes[0] = 0; 
	                    classes[1] = 3; 
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
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_3(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[13] <= 0.5) {
	            if (features[9] <= 0.5) {
	                if (features[1] <= 8.0) {
	                    if (features[7] <= 8.0) {
	                        if (features[2] <= 12.5) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 6; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    classes[0] = 15; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                if (features[14] <= 27.0) {
	                    if (features[14] <= 17.0) {
	                        if (features[3] <= 7.5) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[10] <= 0.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 4; 
	                }
	            }
	        } else {
	            if (features[9] <= 2.5) {
	                if (features[17] <= 36.5) {
	                    if (features[5] <= 42.0) {
	                        if (features[10] <= 3.5) {
	                            if (features[1] <= 1.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[8] <= 6.5) {
	                                    if (features[8] <= 3.0) {
	                                        classes[0] = 14; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        if (features[16] <= 16.0) {
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
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                }
	                            }
	                        } else {
	                            if (features[1] <= 25.0) {
	                                classes[0] = 0; 
	                                classes[1] = 36; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 6; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 8; 
	                }
	            } else {
	                if (features[13] <= 7.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 13; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 2; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_4(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[11] <= 1.5) {
	            if (features[10] <= 3.5) {
	                if (features[8] <= 2.5) {
	                    if (features[1] <= 1.0) {
	                        if (features[16] <= 4.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 31; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[19] <= 57.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 6; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                if (features[4] <= 29.0) {
	                    classes[0] = 0; 
	                    classes[1] = 14; 
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
	            if (features[21] <= 872.5) {
	                if (features[7] <= 51.5) {
	                    if (features[10] <= 4.0) {
	                        if (features[9] <= 2.5) {
	                            if (features[12] <= 1.5) {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[17] <= 36.0) {
	                                    if (features[14] <= 45.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 1; 
	                                    } else {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 3; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 5; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[3] <= 5.5) {
	                            if (features[14] <= 19.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 13; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[17] <= 33.5) {
	                        if (features[10] <= 15.0) {
	                            if (features[1] <= 20.0) {
	                                if (features[14] <= 97.0) {
	                                    if (features[16] <= 18.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 2; 
	                                    } else {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 13; 
	                                }
	                            } else {
	                                if (features[6] <= 24.5) {
	                                    if (features[5] <= 28.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[3] <= 27.5) {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        }
	                    }
	                }
	            } else {
	                if (features[9] <= 5.5) {
	                    classes[0] = 0; 
	                    classes[1] = 8; 
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
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_5(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[5] <= 2.5) {
	            if (features[21] <= 154.5) {
	                classes[0] = 14; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 1; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[8] <= 4.5) {
	                if (features[10] <= 3.5) {
	                    if (features[9] <= 1.5) {
	                        if (features[20] <= 114.5) {
	                            if (features[3] <= 11.5) {
	                                if (features[7] <= 20.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 2; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 21; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        }
	                    } else {
	                        if (features[19] <= 86.5) {
	                            if (features[8] <= 3.0) {
	                                if (features[13] <= 3.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 11; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[7] <= 21.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 3; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                }
	                            } else {
	                                if (features[17] <= 19.0) {
	                                    classes[0] = 2; 
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
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        }
	                    }
	                } else {
	                    if (features[4] <= 3.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 10; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                if (features[14] <= 54.0) {
	                    if (features[16] <= 7.0) {
	                        classes[0] = 0; 
	                        classes[1] = 10; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[21] <= 489.5) {
	                        if (features[13] <= 1.5) {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[5] <= 11.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[20] <= 577.0) {
	                                    if (features[13] <= 3.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 11; 
	                                    } else {
	                                        if (features[3] <= 19.5) {
	                                            classes[0] = 1; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            if (features[3] <= 31.5) {
	                                                if (features[10] <= 12.5) {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 0; 
	                                                    classes[2] = 0; 
	                                                    classes[3] = 2; 
	                                                } else {
	                                                    classes[0] = 0; 
	                                                    classes[1] = 1; 
	                                                    classes[2] = 0; 
	                                                    classes[3] = 0; 
	                                                }
	                                            } else {
	                                                classes[0] = 0; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                                classes[3] = 5; 
	                                            }
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        }
	                    } else {
	                        if (features[4] <= 10.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 3; 
	                        } else {
	                            if (features[5] <= 44.0) {
	                                classes[0] = 0; 
	                                classes[1] = 12; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 2; 
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_6(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[7] <= 10.5) {
	            if (features[16] <= 14.5) {
	                if (features[3] <= 14.5) {
	                    classes[0] = 4; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 3; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                classes[0] = 13; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[9] <= 1.5) {
	                if (features[8] <= 2.5) {
	                    if (features[4] <= 3.0) {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[14] <= 46.0) {
	                            if (features[15] <= 0.5) {
	                                classes[0] = 15; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[5] <= 4.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 2; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            if (features[3] <= 22.5) {
	                                if (features[12] <= 2.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 3; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    if (features[7] <= 89.5) {
	                        if (features[4] <= 28.0) {
	                            if (features[8] <= 5.5) {
	                                if (features[6] <= 11.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 4; 
	                                } else {
	                                    if (features[17] <= 22.0) {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 3; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                }
	                            } else {
	                                if (features[10] <= 5.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 18; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 4; 
	                        }
	                    } else {
	                        if (features[11] <= 4.5) {
	                            if (features[13] <= 5.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 3; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 3; 
	                        }
	                    }
	                }
	            } else {
	                if (features[9] <= 2.5) {
	                    if (features[16] <= 3.0) {
	                        if (features[8] <= 3.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 9; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[8] <= 7.0) {
	                            if (features[6] <= 21.5) {
	                                if (features[14] <= 55.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                } else {
	                                    classes[0] = 2; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            }
	                        } else {
	                            if (features[1] <= 11.0) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[4] <= 22.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        }
	                    }
	                } else {
	                    if (features[6] <= 27.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 12; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_7(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[10] <= 5.5) {
	            if (features[11] <= 1.5) {
	                if (features[6] <= 27.5) {
	                    if (features[12] <= 2.5) {
	                        if (features[17] <= 19.0) {
	                            if (features[17] <= 6.5) {
	                                classes[0] = 7; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[13] <= 0.5) {
	                                    if (features[5] <= 1.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 18; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[17] <= 15.0) {
	                            if (features[21] <= 62.0) {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 3; 
	                            }
	                        } else {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 3; 
	                }
	            } else {
	                if (features[14] <= 97.0) {
	                    if (features[8] <= 5.5) {
	                        classes[0] = 12; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 2; 
	                    }
	                } else {
	                    if (features[12] <= 5.5) {
	                        if (features[20] <= 404.0) {
	                            if (features[11] <= 5.5) {
	                                if (features[14] <= 231.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 17; 
	                                } else {
	                                    if (features[6] <= 26.0) {
	                                        classes[0] = 1; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 3; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[14] <= 294.0) {
	                if (features[16] <= 3.0) {
	                    if (features[11] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 6; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 26; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                if (features[1] <= 23.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 3; 
	                } else {
	                    if (features[8] <= 13.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_8(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[5] <= 2.5) {
	            if (features[10] <= 3.5) {
	                classes[0] = 17; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 3; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[10] <= 3.5) {
	                if (features[11] <= 5.5) {
	                    if (features[3] <= 5.5) {
	                        if (features[20] <= 127.0) {
	                            if (features[7] <= 11.0) {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 2; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[17] <= 11.0) {
	                            if (features[21] <= 663.0) {
	                                if (features[19] <= 9.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 13; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            }
	                        } else {
	                            if (features[3] <= 25.5) {
	                                if (features[6] <= 27.5) {
	                                    if (features[16] <= 22.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 2; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 1; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 4; 
	                                }
	                            } else {
	                                if (features[14] <= 300.5) {
	                                    classes[0] = 10; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                }
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 7; 
	                    classes[3] = 0; 
	                }
	            } else {
	                if (features[12] <= 4.5) {
	                    if (features[0] <= 23.5) {
	                        if (features[8] <= 14.5) {
	                            if (features[11] <= 3.5) {
	                                classes[0] = 0; 
	                                classes[1] = 36; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[10] <= 4.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    if (features[7] <= 22.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 7; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 1; 
	                    }
	                } else {
	                    if (features[10] <= 12.5) {
	                        if (features[9] <= 5.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 4; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[11] <= 2.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 4; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_9(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[8] <= 2.5) {
	            if (features[7] <= 12.5) {
	                if (features[1] <= 1.0) {
	                    classes[0] = 0; 
	                    classes[1] = 2; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 27; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                if (features[9] <= 1.5) {
	                    if (features[2] <= 17.0) {
	                        if (features[0] <= 5.5) {
	                            classes[0] = 13; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[1] <= 11.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 5; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[13] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 8; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[5] <= 21.0) {
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
	            }
	        } else {
	            if (features[11] <= 3.5) {
	                if (features[10] <= 3.5) {
	                    if (features[0] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 4; 
	                    } else {
	                        if (features[3] <= 17.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[20] <= 415.5) {
	                                if (features[6] <= 10.0) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 3; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    if (features[13] <= 14.0) {
	                        if (features[7] <= 95.0) {
	                            classes[0] = 0; 
	                            classes[1] = 25; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[11] <= 2.5) {
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
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 3; 
	                    }
	                }
	            } else {
	                if (features[10] <= 9.0) {
	                    if (features[1] <= 10.5) {
	                        if (features[10] <= 4.0) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[8] <= 4.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 11; 
	                        }
	                    }
	                } else {
	                    if (features[21] <= 719.0) {
	                        classes[0] = 0; 
	                        classes[1] = 5; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 1; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_10(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[9] <= 2.5) {
	            if (features[14] <= 57.5) {
	                if (features[2] <= 12.5) {
	                    if (features[10] <= 3.0) {
	                        if (features[17] <= 6.5) {
	                            if (features[8] <= 2.5) {
	                                if (features[19] <= 13.5) {
	                                    if (features[13] <= 1.5) {
	                                        classes[0] = 3; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        if (features[20] <= 198.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 1; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 1; 
	                                            classes[3] = 0; 
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 14; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            }
	                        } else {
	                            if (features[21] <= 234.0) {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
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
	                        classes[0] = 0; 
	                        classes[1] = 15; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[8] <= 2.5) {
	                        classes[0] = 28; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                if (features[3] <= 31.5) {
	                    if (features[10] <= 4.5) {
	                        if (features[16] <= 16.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 8; 
	                        } else {
	                            if (features[5] <= 31.5) {
	                                classes[0] = 5; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 3; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 20; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 7; 
	                }
	            }
	        } else {
	            if (features[6] <= 27.5) {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 9; 
	                classes[3] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 3; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_11(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[5] <= 2.5) {
	            if (features[16] <= 5.5) {
	                if (features[7] <= 10.0) {
	                    classes[0] = 0; 
	                    classes[1] = 3; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 2; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                if (features[7] <= 14.0) {
	                    classes[0] = 15; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[12] <= 0.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 4; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[14] <= 54.0) {
	                if (features[10] <= 3.0) {
	                    if (features[3] <= 5.5) {
	                        if (features[11] <= 0.5) {
	                            if (features[21] <= 166.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            } else {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[5] <= 18.0) {
	                            if (features[2] <= 11.5) {
	                                if (features[16] <= 8.0) {
	                                    classes[0] = 4; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                }
	                            } else {
	                                classes[0] = 13; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[5] <= 26.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 3; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 28; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                if (features[8] <= 4.5) {
	                    if (features[21] <= 316.5) {
	                        if (features[17] <= 28.5) {
	                            if (features[7] <= 29.0) {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[10] <= 1.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 4; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[18] <= 1.5) {
	                        if (features[10] <= 5.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 10; 
	                        } else {
	                            if (features[10] <= 12.5) {
	                                if (features[5] <= 41.5) {
	                                    if (features[16] <= 40.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 7; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 1; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 4; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 6; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 2; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_12(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[5] <= 1.5) {
	            if (features[11] <= 0.5) {
	                if (features[10] <= 0.5) {
	                    if (features[9] <= 1.5) {
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
	                } else {
	                    classes[0] = 5; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            } else {
	                classes[0] = 7; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 0; 
	            }
	        } else {
	            if (features[14] <= 79.0) {
	                if (features[0] <= 1.5) {
	                    if (features[13] <= 2.5) {
	                        if (features[14] <= 14.5) {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[5] <= 10.5) {
	                                if (features[16] <= 4.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 4; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[7] <= 31.0) {
	                        if (features[6] <= 11.5) {
	                            if (features[7] <= 11.5) {
	                                classes[0] = 0; 
	                                classes[1] = 7; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[12] <= 1.5) {
	                                    classes[0] = 4; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[12] <= 2.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 2; 
	                                    } else {
	                                        if (features[8] <= 1.5) {
	                                            classes[0] = 2; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 3; 
	                                        }
	                                    }
	                                }
	                            }
	                        } else {
	                            if (features[14] <= 75.0) {
	                                if (features[4] <= 9.5) {
	                                    classes[0] = 7; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[4] <= 12.5) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 1; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 4; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        if (features[8] <= 2.5) {
	                            if (features[19] <= 25.5) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[10] <= 3.0) {
	                                if (features[6] <= 13.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 10; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    }
	                }
	            } else {
	                if (features[5] <= 33.5) {
	                    if (features[17] <= 22.0) {
	                        if (features[19] <= 70.5) {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[6] <= 21.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 3; 
	                            } else {
	                                if (features[9] <= 3.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        }
	                    } else {
	                        if (features[2] <= 18.5) {
	                            if (features[14] <= 285.0) {
	                                classes[0] = 0; 
	                                classes[1] = 10; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[20] <= 260.5) {
	                                    if (features[3] <= 33.0) {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 1; 
	                                    } else {
	                                        if (features[17] <= 35.0) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 1; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 1; 
	                                        }
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            if (features[7] <= 40.0) {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
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
	                    if (features[9] <= 2.5) {
	                        if (features[5] <= 41.5) {
	                            if (features[2] <= 13.5) {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[21] <= 487.5) {
	                                    if (features[11] <= 3.5) {
	                                        if (features[17] <= 24.5) {
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
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 6; 
	                                    }
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
	                            classes[3] = 9; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 3; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_13(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[16] <= 7.0) {
	            if (features[17] <= 3.5) {
	                if (features[5] <= 3.5) {
	                    classes[0] = 1; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[6] <= 3.5) {
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
	            } else {
	                if (features[8] <= 1.5) {
	                    if (features[4] <= 3.0) {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 3; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[9] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 14; 
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
	                if (features[10] <= 2.5) {
	                    if (features[18] <= 0.5) {
	                        if (features[3] <= 12.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 3; 
	                        } else {
	                            if (features[8] <= 4.5) {
	                                classes[0] = 34; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 6; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 5; 
	                    }
	                } else {
	                    if (features[3] <= 34.0) {
	                        if (features[8] <= 13.5) {
	                            if (features[12] <= 2.5) {
	                                if (features[17] <= 6.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 18; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                if (features[21] <= 99.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 3; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 3; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 4; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 7; 
	                    }
	                }
	            } else {
	                if (features[6] <= 27.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 12; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 1; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_14(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[5] <= 4.0) {
	            if (features[17] <= 3.5) {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 1; 
	            } else {
	                if (features[16] <= 27.5) {
	                    classes[0] = 14; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[16] <= 32.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 14; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[19] <= 112.5) {
	                if (features[9] <= 2.5) {
	                    if (features[2] <= 13.5) {
	                        if (features[8] <= 1.5) {
	                            if (features[17] <= 3.5) {
	                                if (features[13] <= 2.0) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 2; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 7; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[17] <= 3.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            } else {
	                                if (features[4] <= 3.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 7; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[19] <= 75.0) {
	                                        if (features[6] <= 13.0) {
	                                            if (features[1] <= 3.5) {
	                                                if (features[5] <= 10.5) {
	                                                    if (features[20] <= 305.0) {
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
	                                                    classes[1] = 4; 
	                                                    classes[2] = 0; 
	                                                    classes[3] = 0; 
	                                                }
	                                            } else {
	                                                classes[0] = 0; 
	                                                classes[1] = 0; 
	                                                classes[2] = 0; 
	                                                classes[3] = 1; 
	                                            }
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 9; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        }
	                                    } else {
	                                        if (features[4] <= 13.5) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 1; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 1; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        }
	                                    }
	                                }
	                            }
	                        }
	                    } else {
	                        if (features[10] <= 7.0) {
	                            if (features[19] <= 13.5) {
	                                classes[0] = 3; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[7] <= 23.5) {
	                                    classes[0] = 3; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[21] <= 549.5) {
	                                        if (features[7] <= 79.0) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 13; 
	                                        } else {
	                                            classes[0] = 3; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        }
	                                    } else {
	                                        if (features[5] <= 39.0) {
	                                            classes[0] = 5; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 2; 
	                                        }
	                                    }
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 13; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[9] <= 6.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 8; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 3; 
	                classes[3] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_15(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[5] <= 41.5) {
	            if (features[9] <= 2.5) {
	                if (features[10] <= 2.5) {
	                    if (features[7] <= 25.5) {
	                        classes[0] = 44; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[8] <= 5.5) {
	                            if (features[4] <= 6.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            } else {
	                                if (features[3] <= 19.5) {
	                                    classes[0] = 5; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[8] <= 4.5) {
	                                        if (features[6] <= 26.0) {
	                                            classes[0] = 5; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 1; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 2; 
	                                    }
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 3; 
	                        }
	                    }
	                } else {
	                    if (features[14] <= 294.0) {
	                        if (features[1] <= 25.0) {
	                            if (features[7] <= 46.0) {
	                                classes[0] = 0; 
	                                classes[1] = 27; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[1] <= 6.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 7; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        }
	                    } else {
	                        if (features[3] <= 29.0) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 6; 
	                        }
	                    }
	                }
	            } else {
	                if (features[10] <= 13.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 9; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            }
	        } else {
	            if (features[21] <= 948.5) {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 7; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 1; 
	                classes[3] = 0; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_16(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[14] <= 107.0) {
	            if (features[8] <= 2.5) {
	                if (features[3] <= 5.5) {
	                    if (features[7] <= 13.0) {
	                        if (features[14] <= 19.0) {
	                            classes[0] = 0; 
	                            classes[1] = 3; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 1; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 5; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[10] <= 3.5) {
	                        if (features[9] <= 2.5) {
	                            if (features[7] <= 26.5) {
	                                classes[0] = 28; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[16] <= 13.5) {
	                                    classes[0] = 5; 
	                                    classes[1] = 0; 
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
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 1; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 3; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            } else {
	                if (features[6] <= 4.5) {
	                    if (features[16] <= 10.5) {
	                        if (features[5] <= 13.5) {
	                            classes[0] = 0; 
	                            classes[1] = 4; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 3; 
	                    }
	                } else {
	                    if (features[9] <= 3.5) {
	                        if (features[10] <= 3.0) {
	                            if (features[11] <= 4.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 2; 
	                            } else {
	                                classes[0] = 2; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 22; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 1; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[9] <= 4.0) {
	                if (features[16] <= 22.5) {
	                    if (features[8] <= 4.5) {
	                        if (features[6] <= 27.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        }
	                    } else {
	                        if (features[17] <= 30.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 6; 
	                        } else {
	                            if (features[4] <= 16.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 3; 
	                            }
	                        }
	                    }
	                } else {
	                    if (features[9] <= 0.5) {
	                        if (features[14] <= 336.0) {
	                            if (features[12] <= 1.5) {
	                                if (features[17] <= 34.5) {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 6; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 5; 
	                        }
	                    } else {
	                        if (features[14] <= 359.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        } else {
	                            if (features[0] <= 16.0) {
	                                classes[0] = 0; 
	                                classes[1] = 1; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[0] <= 18.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        }
	                    }
	                }
	            } else {
	                if (features[7] <= 41.5) {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 5; 
	                    classes[3] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_17(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[9] <= 2.5) {
	            if (features[4] <= 22.5) {
	                if (features[7] <= 20.5) {
	                    if (features[10] <= 3.0) {
	                        if (features[1] <= 1.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        } else {
	                            classes[0] = 22; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 9; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    if (features[8] <= 2.5) {
	                        if (features[19] <= 13.5) {
	                            if (features[14] <= 27.0) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            } else {
	                                if (features[21] <= 73.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 6; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[11] <= 7.5) {
	                            if (features[21] <= 236.5) {
	                                if (features[10] <= 5.0) {
	                                    if (features[5] <= 26.5) {
	                                        if (features[5] <= 19.0) {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 3; 
	                                        } else {
	                                            classes[0] = 1; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 4; 
	                                    }
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 12; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 25; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        }
	                    }
	                }
	            } else {
	                if (features[8] <= 4.5) {
	                    classes[0] = 9; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[10] <= 15.0) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 9; 
	                    } else {
	                        if (features[5] <= 42.5) {
	                            classes[0] = 0; 
	                            classes[1] = 2; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 1; 
	                        }
	                    }
	                }
	            }
	        } else {
	            if (features[6] <= 27.5) {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 10; 
	                classes[3] = 0; 
	            } else {
	                classes[0] = 0; 
	                classes[1] = 0; 
	                classes[2] = 0; 
	                classes[3] = 2; 
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_18(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[8] <= 2.5) {
	            if (features[20] <= 218.0) {
	                if (features[4] <= 3.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 3; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[0] <= 1.5) {
	                        classes[0] = 0; 
	                        classes[1] = 1; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        if (features[14] <= 5.5) {
	                            if (features[0] <= 15.5) {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 3; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 4; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            if (features[21] <= 903.5) {
	                                if (features[5] <= 35.0) {
	                                    if (features[10] <= 3.5) {
	                                        if (features[9] <= 3.5) {
	                                            classes[0] = 33; 
	                                            classes[1] = 0; 
	                                            classes[2] = 0; 
	                                            classes[3] = 0; 
	                                        } else {
	                                            classes[0] = 0; 
	                                            classes[1] = 0; 
	                                            classes[2] = 1; 
	                                            classes[3] = 0; 
	                                        }
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 1; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                } else {
	                                    if (features[7] <= 32.5) {
	                                        classes[0] = 2; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 2; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 1; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    }
	                }
	            } else {
	                if (features[20] <= 277.5) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 3; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[4] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 2; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    } else {
	                        classes[0] = 1; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                }
	            }
	        } else {
	            if (features[10] <= 4.0) {
	                if (features[7] <= 78.0) {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 13; 
	                } else {
	                    if (features[13] <= 3.5) {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 3; 
	                    } else {
	                        if (features[14] <= 202.0) {
	                            classes[0] = 2; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 3; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            } else {
	                if (features[11] <= 5.5) {
	                    if (features[18] <= 1.0) {
	                        if (features[8] <= 3.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[21] <= 78.0) {
	                                if (features[4] <= 28.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 4; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 1; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 30; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        if (features[3] <= 30.0) {
	                            classes[0] = 0; 
	                            classes[1] = 1; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 4; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict_19(double[] features) {
	        int[] classes = new int[4];
	        
	        if (features[6] <= 25.0) {
	            if (features[0] <= 9.5) {
	                if (features[7] <= 25.5) {
	                    if (features[0] <= 1.5) {
	                        if (features[14] <= 32.0) {
	                            if (features[12] <= 1.5) {
	                                if (features[21] <= 310.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 3; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 1; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                }
	                            } else {
	                                if (features[2] <= 10.5) {
	                                    classes[0] = 0; 
	                                    classes[1] = 1; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 3; 
	                                    classes[3] = 0; 
	                                }
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        }
	                    } else {
	                        if (features[1] <= 7.0) {
	                            if (features[19] <= 42.5) {
	                                if (features[14] <= 5.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 2; 
	                                    classes[2] = 0; 
	                                    classes[3] = 0; 
	                                } else {
	                                    if (features[10] <= 4.0) {
	                                        classes[0] = 23; 
	                                        classes[1] = 0; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    } else {
	                                        classes[0] = 0; 
	                                        classes[1] = 2; 
	                                        classes[2] = 0; 
	                                        classes[3] = 0; 
	                                    }
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        }
	                    }
	                } else {
	                    if (features[2] <= 13.5) {
	                        if (features[1] <= 5.0) {
	                            if (features[10] <= 4.0) {
	                                if (features[4] <= 3.0) {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 1; 
	                                    classes[3] = 0; 
	                                } else {
	                                    classes[0] = 0; 
	                                    classes[1] = 0; 
	                                    classes[2] = 0; 
	                                    classes[3] = 2; 
	                                }
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 14; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        if (features[4] <= 16.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 2; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        }
	                    }
	                }
	            } else {
	                if (features[12] <= 4.5) {
	                    if (features[3] <= 23.5) {
	                        if (features[7] <= 11.5) {
	                            classes[0] = 3; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 0; 
	                        } else {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        }
	                    } else {
	                        classes[0] = 12; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 0; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 1; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            }
	        } else {
	            if (features[21] <= 489.5) {
	                if (features[8] <= 1.5) {
	                    classes[0] = 4; 
	                    classes[1] = 0; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                } else {
	                    if (features[0] <= 17.5) {
	                        if (features[20] <= 45.0) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 0; 
	                            classes[3] = 6; 
	                        } else {
	                            if (features[19] <= 81.0) {
	                                classes[0] = 0; 
	                                classes[1] = 3; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 1; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 7; 
	                    }
	                }
	            } else {
	                if (features[0] <= 13.5) {
	                    if (features[5] <= 38.5) {
	                        if (features[16] <= 27.5) {
	                            classes[0] = 0; 
	                            classes[1] = 0; 
	                            classes[2] = 2; 
	                            classes[3] = 0; 
	                        } else {
	                            if (features[0] <= 10.0) {
	                                classes[0] = 1; 
	                                classes[1] = 0; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            } else {
	                                classes[0] = 0; 
	                                classes[1] = 2; 
	                                classes[2] = 0; 
	                                classes[3] = 0; 
	                            }
	                        }
	                    } else {
	                        classes[0] = 0; 
	                        classes[1] = 0; 
	                        classes[2] = 0; 
	                        classes[3] = 6; 
	                    }
	                } else {
	                    classes[0] = 0; 
	                    classes[1] = 7; 
	                    classes[2] = 0; 
	                    classes[3] = 0; 
	                }
	            }
	        }
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < 4; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
	    }
	    
	    public static int predict(double[] features) {
	        int n_classes = 4;
	        int[] classes = new int[n_classes];
	        classes[GameplayClassifier.predict_0(features)]++;
	        classes[GameplayClassifier.predict_1(features)]++;
	        classes[GameplayClassifier.predict_2(features)]++;
	        classes[GameplayClassifier.predict_3(features)]++;
	        classes[GameplayClassifier.predict_4(features)]++;
	        classes[GameplayClassifier.predict_5(features)]++;
	        classes[GameplayClassifier.predict_6(features)]++;
	        classes[GameplayClassifier.predict_7(features)]++;
	        classes[GameplayClassifier.predict_8(features)]++;
	        classes[GameplayClassifier.predict_9(features)]++;
	        classes[GameplayClassifier.predict_10(features)]++;
	        classes[GameplayClassifier.predict_11(features)]++;
	        classes[GameplayClassifier.predict_12(features)]++;
	        classes[GameplayClassifier.predict_13(features)]++;
	        classes[GameplayClassifier.predict_14(features)]++;
	        classes[GameplayClassifier.predict_15(features)]++;
	        classes[GameplayClassifier.predict_16(features)]++;
	        classes[GameplayClassifier.predict_17(features)]++;
	        classes[GameplayClassifier.predict_18(features)]++;
	        classes[GameplayClassifier.predict_19(features)]++;
	    
	        int class_idx = 0;
	        int class_val = classes[0];
	        for (int i = 1; i < n_classes; i++) {
	            if (classes[i] > class_val) {
	                class_idx = i;
	                class_val = classes[i];
	            }
	        }
	        return class_idx;
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

