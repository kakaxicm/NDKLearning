#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_qicode_ndklearning_JniHelloWord_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "String from JniHelloWord";
    return env->NewStringUTF(hello.c_str());
}
