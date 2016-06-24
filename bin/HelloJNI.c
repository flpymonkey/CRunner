#include <jni.h>
#include <conio.h>
#include <stdio.h>
#include "HelloJNI.h"

JNIEXPORT void JNICALL Java_HelloJNI_sayHello
  (JNIEnv *, jobject)
{
	printf("\nHello World!\n");
	return;
}